module product/order-ui

imports product/order/order-data

access control rules
  rule page newOrderItem(book : Book) { isCustomer() } 
  rule page viewOrderHistory(){isCustomer()}
  rule page payment(order: Order){ isCustomer()}
  rule page viewInProgressOrder(order: Order){isCustomer() || isAdministrator() }
  rule page newSpecialOffer() {isAdministrator()}
  rule page editSpecialOffer(specialOffer: SpecialOffer) {isAdministrator()}
  rule page viewSpecialOffer(specialOffer: SpecialOffer){ true}
  rule page specialOffers(){true}
 section order item management

  define deleteItemAction(order: Order , item: OrderItem){
  	actionLink("Remove", action{ order.orderItems.remove(item);
  		if(order.orderItems.length ==0){
  			return mypage();
  		}
  	 })
  }
  
 function createOrderItem(orderedBook: Book, specialOffer : SpecialOffer): Order{
	var user: User;
 	var inprogressOrder : List<Order>;
 	var prevItems : List<OrderItem> ;
 	var dt	: DateTime;
 	var dtstr : String;
 	var ostatus: OrderStatus;	
 	var ord : Order;
 	var item : OrderItem;
 	
 	
 	log("Starting init");
 	
		 	
 		user :=  securityContext.principal;
	 	inprogressOrder := from Order as o where o.customer = ~user;
	 	log("Query done");
	 	 dt	 := now();
	 	dtstr := dt.format("yyMMddHHmmss");
	 	ostatus := statusInProgress	;
	 	 ord	:= Order{};
	 	 item := OrderItem{};

 		
 		inprogressOrder :=[o | o : Order in inprogressOrder where o.status == statusInProgress ];
 		log("In progress order retrieved");
 		item.count := 1;
 		if(orderedBook != null){ 
			item.book := orderedBook ; 
		} 
		if(specialOffer!= null){
			item.specialOffer := specialOffer;
			log("specialOffer is not Null");
		}
		
	 	if (inprogressOrder.length == 0){
	 		ord  := Order{ /*code := dtstr , */ customer := securityContext.principal , status := ostatus , 
	 		date :=  dt };
	 		ord.orderItems.add(item);
	 		ord.customer := user;
	 		log("In progress order is new");
	 		ord.save();
	 	}  
	 	if(inprogressOrder.length == 1) {
	 		
	 		ord  :=	inprogressOrder[0];
			if(orderedBook != null){
		 		var matchingOrderItems := [oi | oi:OrderItem in ord.orderItems.list() where oi.book == orderedBook];
		 		if(matchingOrderItems.length == 0){
		 			ord.orderItems.add(item);
		 		}
	 		}

			if(specialOffer!= null){
		 		var matchingOrderItems := [oi | oi:OrderItem in ord.orderItems.list() where oi.specialOffer == specialOffer];
		 		if(matchingOrderItems.length == 0){
					ord.orderItems.add(item);
				}
			}
	 		
		 	log("In progress order was created before");
	 		
	 		
	 	}
	 	 
 	return ord;
 }
 
 
define page viewInProgressOrder(order: Order){
	main
	define body(){
		normalOrderItems(order)

	}
}

define normalOrderItems(ord: Order){
			par{output("Order creation date: " + ord.date + "\n")}
			
			if(ord.orderItems.length==0){
				<table id="gradient-style">
					<thead>
						<tr>
							<th scope="col">output("Currently there is no item in your list.")</th>
					        </tr>
					</thead>
				</table>
			
			} else{
			
			
			form{
			output("Normal Orders")
			<table id="gradient-style">
				<thead>
					<tr>
						<th scope="col">output("Title")</th>
						<th scope="col">output("Count")</th>
						<th scope="col">output("HardCopy Available")</th>
						<th scope="col">output("Ebook Available")</th>
						<th scope="col">output("Unit Price")</th>
						<th scope="col">output("Discount")</th>
						<th scope="col">output("Type")</th>
			        	<th scope="col">output("")</th>
				        	//<th scope="col">Rating</th>
				        </tr>
				</thead>
						for(item:OrderItem in ord.orderItems where item.book != null){
						
							row{
								column{output( item.book.title)}
								column{ input(item.count) } 
								//validate((item.count <= item.book.hardCopyAvailableCount), 
								//"Not enough available.")
								column{ output( item.book.hardCopyAvailableCount)}
								column{ output( item.book.eBookAvailableCount)}
								column{	output(	item.book.price)}
								column{	output(	item.book.discount)}
								column{	input(	item.orderType)}
								column{
								submitlink action{
							          ord.orderItems.remove(item);
							          if(ord.orderItems.length ==0){
							              // return mypage();
							          }} { image("/images/remove.gif") }
								}
							
							}
						}
						
			</table>

			output("Special Offers")
			<table id="gradient-style">
				<thead>
					<tr>
						<th scope="col">output("Name")</th>
						<th scope="col">output("Price")</th>
						<th scope="col">output("")</th>

			        </tr>
			        				</thead>
						for(item:OrderItem in ord.orderItems where item.specialOffer != null){
						
							row{
								column{output( item.specialOffer.name)}
								column{ output(item.specialOffer.totalPrice) } 
								column{
								submitlink action{
							          ord.orderItems.remove(item);
							          if(ord.orderItems.length ==0){
							              // return mypage();
							          }} { image("/images/remove.gif") }
								}
							
							}
						}
						
			</table>

			
			
				submit checkout(ord) {"Check out" }
			}
	
			 }		
	
		 action checkout(order: Order){
		 	
		 	for(item:OrderItem in order.orderItems where item.book!= null){
		 		if(item.orderType== hardCopy){
			 		validate(item.count <= item.book.hardCopyAvailableCount, "Not enough items left for: "+ item.book.title);
		 		}
		 		if(item.orderType== electronic){
			 		validate(item.count <= item.book.eBookAvailableCount, "Not enough items left for: "+item.book.title);
		 		}
		 	}
		 	
		 	return payment(order);
		 } 
 }
 define page payment(order: Order){
	var totalNormalPrice: Float :=0.0
	var totalSpecialPrice: Float :=0.0
	var total: Float :=0.0;
	var discount: Float :=0.0;
 	main
 	define body(){
	init{
		
		for(item : OrderItem in order.orderItems where item.book != null){
			
			totalNormalPrice := totalNormalPrice + item.count.floatValue()* item.book.price;
			discount	:= discount + item.book.discount;
		}
		for(item : OrderItem in order.orderItems where item.specialOffer != null){
			totalSpecialPrice := totalSpecialPrice + item.specialOffer.totalPrice;
		}
		total := totalSpecialPrice + totalNormalPrice - discount;
	}
 	output("Order to be checked out:")
	
		form{
		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Book Title")</th>
					<th scope="col">output("Count")</th>
					<th scope="col">output("Unit Price")</th>
					<th scope="col">output("Discount")</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</thead>
					for(item:OrderItem in order.orderItems where item.book!= null){
					
						row{
							column{output( item.book.title)}
							column{ output(item.count) } 
							//validate((item.count <= item.book.hardCopyAvailableCount), 
							//"Not enough available.")
							column{	output(	item.book.price)}
							column{	output( item.book.discount)}
						
						}
					}
			<tfoot>
				<tr>
					<th scope="col">output("")</th>
					<th scope="col">output("")</th>
					<th scope="col">output(totalNormalPrice)</th>
					<th scope="col">output(discount)</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</tfoot>
					
		</table>

		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Special Offer Name")</th>
					<th scope="col">output("Price")</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</thead>
					for(item:OrderItem in order.orderItems where item.specialOffer!= null){
					
						row{
							column{output( item.specialOffer.name)}
							column{ output(item.specialOffer.totalPrice) } 
						
						}
					}
			<tfoot>
				<tr>
					<th scope="col">output("")</th>
					<th scope="col">output(totalSpecialPrice)</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</tfoot>
					
		</table>
		par{output("Total price to be paid is " + total)}
		submit pay(order){"Pay"}
 	}

 }
	 action pay(order: Order){
		for(item: OrderItem in order.orderItems){
			if(item.orderType == hardCopy){
	 			item.book.hardCopyAvailableCount := item.book.hardCopyAvailableCount - item.count;
	 		} 
			if(item.orderType == electronic){
	 			item.book.eBookAvailableCount := item.book.eBookAvailableCount - item.count;
	 		} 
	 	}
	 	order.status := statusSubmitted;
	 	order.date := now();
	 	message("Payment successfully done. Your order will be delivered or emailed to your address.");
		return mypage();
	 }
 }
 define page viewOrderHistory(){
   	var ord: Order
  	var submittedOrders : List<Order>
  	var user: User 
	
	main
	define body(){
	init{
		user := securityContext.principal;
	 	submittedOrders := from Order as o where o.customer = ~user;
		
		submittedOrders :=[o | o : Order in submittedOrders where o.status == statusSubmitted order by o.date desc];
	}
			header{output(user.firstname + " order history") }
			<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Title")</th>
					<th scope="col">output("Type")</th>
					<th scope="col">output("Order Count")</th>
					<th scope="col">output("Date")</th>
			        </tr>
			</thead>

			for(order :Order in submittedOrders){
				for(item: OrderItem in order.orderItems){
					row{
						if(item.book!= null){
							column{navigate(book(item.book,"")){ output(item.book.title) }}
							column{output("Normal")}
							column{output(item.count)}
						} 
						if(item.specialOffer!= null){
							column{navigate(viewSpecialOffer(item.specialOffer)){ output(item.specialOffer.name) }}
							column{output("Special Offer")}
							column{output(1)}
						}
						column{output(order.date)}
					}
					
				}
			}
			
			</table>
	}
 
 }
 
 section special offer
 
 define page newSpecialOffer(){
	main
	define body(){
		var specialOffer : SpecialOffer := SpecialOffer{}
		init{
			
		}
		form{
			header{"New Special Offer"}
			par{label("Name") {input(specialOffer.name)}}
			par{label("Description") {input(specialOffer.description)}}
			par{label("Published?") {input(specialOffer.published)}}
			par{label("Expiration Date") {input(specialOffer.expirationDate){
				validate(specialOffer.expirationDate.after(now()),	"Please enter a valid date.")}
			}}
			par{label("Total Price") {input(specialOffer.totalPrice)}}
			
			par{output("You can add books to this special offer with search and browsing")}
			submit create(specialOffer){"Create"}
		}
	}
	action  create(offer : SpecialOffer){
		offer.save();
		message("Special offer created. You can search or browse bood to add to special offer");
		return specialOffers();
	}
 }
 
 define page editSpecialOffer(specialOffer: SpecialOffer){
	main
	define body(){
		init{
			
		}
		form{
			header{"Edit Special Offer"}
			par{label("Name") {input(specialOffer.name)}}
			par{label("Description") {input(specialOffer.description)}}
			par{label("Published?") {input(specialOffer.published)}}
			par{label("Expiration Date") {input(specialOffer.expirationDate)}}
			par{label("Total Price") {input(specialOffer.totalPrice)}}
			par{output("You can add books to this special offer with search and browsing")}
			
			<table id="gradient-style">
				row{
					for(book: Book in specialOffer.items){
							column{output(book.frontImage)}
					}
				}
				
				row{
					for(book: Book in specialOffer.items){
						column{output(book.title)}
					}
				}				
			</table>
			submit save(specialOffer){"Save"}
		}
	}
	action  save(offer : SpecialOffer){
		message("Special offer saved successfully.");
	}
 	
 }
 
 define page viewSpecialOffer(specialOffer: SpecialOffer){
 		main
 		define body(){
			header{"View Special Offer"}
			<table id="gradient-style">
				row{
					column{output("Name")}
					column{output(specialOffer.name)}
				}
				row{
					column{output("Description")}
					column{output(specialOffer.description)}
				}				
				row{
					column{output("Due Date")}
					column{output(specialOffer.expirationDate)}
				}				
				row{
					column{output("Total Price")}
					column{output(specialOffer.totalPrice)}
				}				
				
			</table>			
	
			<table id="gradient-style">
				row{
					for(book: Book in specialOffer.items){
							column{output(book.frontImage)}
					}
				}
				
				row{
					for(book: Book in specialOffer.items){
						column{output(book.title)}
					}
				}				
			</table>
			form{
				submitlink action{
				var order: Order := createOrderItem(null as Book, specialOffer);
				return viewInProgressOrder(order);
		          } { image("/images/addcart.png") }
	         }
		
 	}
 }
 
 define page specialOffers(){
	main
	define body(){
		
		for(specialOffer: SpecialOffer  where specialOffer.published==true){
			form{
				<table id="gradient-style">
					<thead>
						<tr>
							if(!isAdministrator()){
								<th colspan=specialOffer.items.length scope="col">navigate(viewSpecialOffer(specialOffer)){ output(specialOffer.name) }</th>
							} else{
								<th colspan=specialOffer.items.length scope="col">navigate(editSpecialOffer(specialOffer)){ output(specialOffer.name) }</th>
							}
				        </tr>
					</thead>
		
					row{
						for(book: Book in specialOffer.items){
								column{output(book.frontImage)}
								
						}
					}
					
					row{
						for(book: Book in specialOffer.items){
							column{output(book.title)}
						}
					}
				</table>
			}
			submitlink action{
			var order: Order := createOrderItem(null as Book, specialOffer);
			return viewInProgressOrder(order);
	          } { image("/images/addcart.png") }
			
		}
	}
	
 }
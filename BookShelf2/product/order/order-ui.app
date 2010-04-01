module product/order-ui

imports product/order/order-data

access control rules
  rule page newOrderItem(book : Book) { isCustomer() } 
  rule page viewOrderHistory(){isCustomer()|| isAdministrator()}
  rule page payment(order: Order){ isCustomer()}
  rule page viewInProgressOrder(order: Order){isCustomer() || isAdministrator() }
  rule page newSpecialOffer() {isAdministrator()}
  rule page editSpecialOffer(specialOffer: SpecialOffer) {isAdministrator()}
   
 section order item management

  define deleteItemAction(order: Order , item: OrderItem){
  	actionLink("Remove", action{ order.orderItems.remove(item);
  		if(order.orderItems.length ==0){
  			return mypage();
  		}
  	 })
  }
  
 function createOrderItem(orderedBook: Book): Order{
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
		item.book := orderedBook ; 
	
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

	 		var matchingOrderItems := [oi | oi:OrderItem in ord.orderItems.list() where oi.book == orderedBook];
	 		if(matchingOrderItems.length == 0){
	 			ord.orderItems.add(item);
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
			<table id="gradient-style">
				<thead>
					<tr>
						<th scope="col">output("Title")</th>
						<th scope="col">output("Count")</th>
						<th scope="col">output("Available")</th>
						<th scope="col">output("Unit Price")</th>
						<th scope="col">output("Type")</th>
			        	<th scope="col">output("")</th>
				        	//<th scope="col">Rating</th>
				        </tr>
				</thead>
						for(item:OrderItem in ord.orderItems){
						
							row{
								column{output( item.book.title)}
								column{ input(item.count) } 
								//validate((item.count <= item.book.hardCopyAvailableCount), 
								//"Not enough available.")
								column{ output( item.book.hardCopyAvailableCount)}
								column{	output(	item.book.price)}
								column{	input(	item.orderType)[notnull:=true]}
								column{
								submitlink action{
							          ord.orderItems.remove(item);
							          if(ord.orderItems.length ==0){
							              return mypage();
							          }} { image("/images/remove.gif") }
								}
							
							}
						}
						
			</table>
				submit checkout(ord) {"Check out" }
			}
	
			 }		
	
		 action checkout(order: Order){
		 	return payment(order);
		 } 
 }
 define page payment(order: Order){
	var totalPrice: Float :=0.0
 	main
 	define body(){
	init{
		
		for(item : OrderItem in order.orderItems){
			
			totalPrice := totalPrice + item.count.floatValue()* item.book.price; 
		}
	}
 	output("Order to be checked out:")
		
		form{
		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Title")</th>
					<th scope="col">output("Count")</th>
					<th scope="col">output("Unit Price")</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</thead>
					for(item:OrderItem in order.orderItems){
					
						row{
							column{output( item.book.title)}
							column{ output(item.count) } 
							//validate((item.count <= item.book.hardCopyAvailableCount), 
							//"Not enough available.")
							column{	output(	item.book.price)}
						
						}
					}
			<tfoot>
				<tr>
					<th scope="col">output("")</th>
					<th scope="col">output("")</th>
					<th scope="col">output(totalPrice)</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</tfoot>
					
		</table>
		submit pay(order){"Pay"}
 	}

 }
	 action pay(order: Order){
		for(item: OrderItem in order.orderItems){
	 		item.book.hardCopyAvailableCount := item.book.hardCopyAvailableCount - item.count; 
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
		
		submittedOrders :=[o | o : Order in submittedOrders where o.status == statusSubmitted ];
	}
			header{output(user.firstname + " order history") }
			<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Title")</th>
					<th scope="col">output("Order Count")</th>
					<th scope="col">output("Date")</th>
			        </tr>
			</thead>

			for(order :Order in submittedOrders){
				for(item: OrderItem in order.orderItems){
					row{
						column{output(item.book.title)}
						column{output(item.count)}
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
			par{label("Expiration Date") {input(specialOffer.expirationDate)}}
			par{label("Total Price") {input(specialOffer.totalPrice)}}
			
			par{output("You can add books to this special offer with search and browsing")}
			submit create(specialOffer){"Create"}
		}
	}
	action  create(offer : SpecialOffer){
		offer.save();
		message("Special offer created. You can search or browse bood to add to special offer");
		return mypage();
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
		
	}
 	
 }
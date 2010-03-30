module product/order-ui

imports product/order/order-data

access control rules
  rule page newOrderItem(book : Book) { isCustomer() } 
  rule page viewOrderHistory(){isCustomer()|| isAdministrator()}

section	order management

define page newOrder(){
//	header("Order Items")
	
}

define page editOrder(order : Order){
}

define page viewOrder(order : Order){
}

 
 section order item management

  define deleteItemAction(order: Order , item: OrderItem){
  	actionLink("Remove", action{ order.orderItems.remove(item); })
  }
   
 define page newOrderItem(orderedBook: Book){ 
 	
 	main
 	define body(){
	var user: User
 	var inprogressOrder : List<Order>
 	var prevItems : List<OrderItem> 
 	var dt	: DateTime
 	var dtstr : String
 	var ostatus: OrderStatus	
 	var ord : Order
 	var item : OrderItem
 	
 	init{
 	log("Starting init");
 	
		 	
 		user :=  securityContext.principal;
	 	inprogressOrder := from Order as o where o.customer = ~user;
	 	log("Query done");
	 	 dt	 := now();
	 	dtstr := dt.format("yyMMddHHmmssZ");
	 	ostatus := statusInProgress	;
	 	 ord	:= Order{};
	 	 item := OrderItem{};

 		
 		inprogressOrder :=[o | o : Order in inprogressOrder where o.status == statusInProgress ];
 		log("In progress order retrieved");
 		item.count := 1; 
		item.book := orderedBook ; 
	
	 	if (inprogressOrder.length == 0){
	 		ord  := Order{ code := dtstr , customer := securityContext.principal , status := ostatus , 
	 		date :=  dt };
	 		ord.orderItems.add(item);
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
	 	 
 	}
		//orderView(ord)
		
	 	inProgressOrderView(ord)

//		message("New item added to your order list successfully.")
 	}
 	
 	

 
 }

 	define inProgressOrderView(ord: Order){
		par{output("Order creation date: " + ord.date + "\n")}

		form{
		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Title")</th>
					<th scope="col">output("Count")</th>
					<th scope="col">output("Available")</th>
			        	<th scope="col">output("")</th>
			        	//<th scope="col">Rating</th>
			        </tr>
			</thead>
			if (ord.orderItems.length >0){
					for(item:OrderItem in ord.orderItems){
					
						row{
							column{output( item.book.title)}
							column{ input(item.count) { 
							//validate((item.count <= item.book.hardCopyAvailableCount), 
							//"Not enough available.")
							 
							}
							column{ output( item.book.hardCopyAvailableCount)}
							
							}
							column{deleteItemAction(ord, item)}
						}
					}
					
			} else {
				output(" No item is added ")
			}		
		</table>
			//submit checkout(ord) {"Check out" }
		}
		 action checkout(order: Order){
		 	for(item: OrderItem in order.orderItems){
		 		item.book.hardCopyAvailableCount := item.book.hardCopyAvailableCount - item.count; 
		 	}
		 	order.status := statusSubmitted;
		 	order.date := now();
		 	message("Order successfully checked out");
		 	return mypage();
		 }		
 }
 
 define page viewOrderHistory(){
   	var ord: Order
  	var submittedOrders : List<Order>
  	var user: User := securityContext.principal
	init{
	
	 	submittedOrders := from Order as o where o.customer = ~user;
		
		submittedOrders :=[o | o : Order in submittedOrders where o.status == statusSubmitted ];
	}
	
	main
	define body(){
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
 define orderView(order: Order){
	par{ output(order.code)}
	par{ output(order.date)}
//	par{ output(order.orderItems) } 
 }
 
 /*
   define ajax signin() {
    init{ if(!loggedIn()) { goto login(); } }
    var username : String
    var password : Secret
    action doit(){ signin(username, password); }
    header{"Sign In"}
    form{
      par{ label("Username"){ input(username) } }
      par{ label("Password"){ input(password) } }
      //par{ validate(checkPassword(username, password), "That combination of username and password is not correct.") }
      par{ action("Sign in", doit())[id:=submit,ajax] }
    }
    }
    */
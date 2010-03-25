module product/order-ui

imports product/order/order-data

access control rules
  rule page newOrderItem(book : Book) { true } 


section	order management

define page newOrder(){
//	header("Order Items")
	
}

define page editOrder(order : Order){
}

define page viewOrder(order : Order){
}

 
 section order item management
 
 define page newOrderItem(orderedBook: Book){ 
	var user: User :=  securityContext.principal
 	var inprogressOrder : List<Order> := from Order as o where o.customer = ~user
 	var dt	: DateTime := now()
 	var dtstr : String := dt.format("yyMMddHHmmssZ")
 	var ostatus: OrderStatus := statusInProgress	
 	var ord : Order	
 	var item : OrderItem
 	init{
 		inprogressOrder :=[o | o : Order in inprogressOrder where o.status == statusInProgress ];
 		item.count := orderedBook.hardCopyAvailableCount; 
		item.book := orderedBook ; 
	 	if (inprogressOrder.length == 0){
	 		ord  := Order{ code := dtstr , customer := securityContext.principal , status := ostatus , 
	 		date :=  dt };
	 		ord.orderItems.add(item);
	 		ord.save();
	 	}  
	 	if(inprogressOrder.length == 1) {
	 		ord  :=	inprogressOrder[0];
	 		ord.orderItems.add(item);
	 	} 
 	} 
 	
 	main
 	define body(){
	header{output("New OrderItem")}
		//orderView(ord)
		output("salam")
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
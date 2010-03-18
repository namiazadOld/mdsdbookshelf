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
 
 define page newOrderItem(book: Book){
 	var user: User :=  securityContext.principal
 	var inprogressOrder : List<Order> := from Order as o where o.customer = ~user and  o.status = OrderStatus.statusInProgress
 	main()
 	define body(){
	 	if (inprogressOrder.length == 0){
	 		
	 		<script>alert("No orders in progress. Creating a new order")</script>
	 		
	 		
	 	}  
	 	if(inprogressOrder.length == 1) {
	 		<script>("adding the book to the in progress order")</script>
	 	} 
 	}
 	
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
module product/order-ui

imports product/order/order-data


section	order management

define page newOrder(){
//	header("Order Items")
	
}

define page editOrder(order : Order){
}

define page viewOrder(order : Order){
}

 
 section order item management
 
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
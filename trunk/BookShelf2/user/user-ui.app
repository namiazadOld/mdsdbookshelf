module user/user-ui

imports user/user-data
imports product/order/order-ui
//imports user/test-data

access control rules
  rule page login() { true } 
  rule page signup()   { !isCustomer() && !isShipper() && !isAdministrator() }
  rule page mypage()   { isCustomer() }
  rule page profile(user: User) { isAdministrator() || isCustomer() || isShipper()}
  rule page editProfile() { isAdministrator() || isCustomer() }
  rule ajaxtemplate signin()   { true }
  
section changing password
  
  define changePassword(user : User) {
    var password1 : Secret
    var password2 : Secret
    action change() {
      validate(password1 == password2, "Passwords do not match.");
      user.changePassword(password1);
      user.save();
      message("Your password has been changed.");
    }
    section{
      header{"Change Password"}
      form{
        par{ label("Password: "       ){ input(password1) } }
        par{ label("Repeat password: "){ input(password2) { validate(password1 == password2, "Passwords do not match.") } } }
        action("Change password", change())
      }
    }
  }
  
section login

 define page login(){
	init{ if(loggedIn()) { return root(); } }
	 
	main()
	define body(){
		signin()
	}
 } 

  define signin() {
    init{ if(loggedIn()) { return root(); } }
    var username : String
    var password : Secret
    action doit(){ signin(username, password); }
    header{"Sign In"}
    form{
      par{ label("Username"){ input(username) } }
      par{ label("Password"){ input(password) } }
      par{ action("Sign in", doit())[id:=submit] }
    }
    header{"Register"}
    par{ "No account? " navigate(signup()){ "Register now" } }
  }
  
  
  define signoutLink(){
  	actionLink("Signout", action{ signout(); return root(); })
  }
  
  define signinLink() {
//    action showForm() { replace(content, signin()); }
//    form{ actionLink("Sign in", showForm())[ajax] }
    navigate(login()){"Login"}
  }
  
  
  define signinoff() {
    if(securityContext.principal != null) { 
       signoutLink() 
    } else { 
      signinLink()
    }
  }
 
define page signup() {
    var user := User{}
    var password : Secret
    main()
    define body(){
    
      section{
        header{"Sign Up"}
        form{ 
          par{ label("Username"){ input(user.username) } }
          par{ label("Password"){ input(user.password) } }
          par{ label("Confirm password"){ input(password) {
                validate(password == user.password, "Passwords do not match!") } } }
          par{ label("First Name"){ input(user.firstname) } }
          par{ label("Last Name"){ input(user.lastname) } }
          par{ label("Gender"){ input(user.gender) } }
          par{ label("Birthday"){ input(user.birthdate) } }
          par{ label("Email"){ input(user.email) } }
          
          par{ label("Address Street1"){ input(user.address1) } }
          par{ label("Address Street2"){ input(user.address2) } }
          par{ label("Phone Number"){ input(user.phoneno) } }
          par{ label("Mobile Number"){ input(user.mobileno) } }
//          par{ label("Please enter the text below: "){ captcha() } }
          action("Sign Up", action{ user.signup(); return root(); }) 
        }
      }
    }
  }
  
section account management

  define page mypage() {
    init{ if(!loggedIn()) { return root(); } }
    
    main()
    define body(){
      account(securityContext.principal)
    }
  }
 
  define page profile(user: User){
	init{ if(!loggedIn()) { return root(); } }
	main
	define body(){
		//accountData(user)
	}
  }

  define account(user : User) {
  	var ord: Order
  	var inprogressOrder : List<Order>
	init{
	 	inprogressOrder := from Order as o where o.customer = ~user;
		ord	:= Order{};
		inprogressOrder :=[o | o : Order in inprogressOrder where o.status == statusInProgress ];
		if(inprogressOrder.length == 1){
			ord  :=	inprogressOrder[0];
		}    	
	}
    section{
      header{"Your Account"}
      accountData(user, ord)
      viewNewOrders(ord, inprogressOrder)
      par{output("")}
      changePassword(user)
//      changeEmailAddress(user)
    }
  }
  
  define viewNewOrders(ord:Order , list : List<Order>){
         header{"Latest Order in Progress"}
	if(list.length == 1){ 
		inProgressOrderView(ord)
	}
  }
  define accountData(user : User, ord: Order) {
    section{
      header{"Account Data"}
      		<table id="gradient-style">
			row{
				column{output("Username")}
				column{output(user.username)}
			}
			row{
				column{output("First Name")}
				column{output(user.firstname)}
			}
			row{
				column{output("Last Name")}
				column{output(user.lastname)}
			}
			row{
				column{output("Email")}
				column{output(user.email)}
			}
			row{
				column{output("Date of Birth")}
				column{output(user.birthdate)}
			}
			row{
				column{output("Phone NO")}
				column{output(user.phoneno)}
			}
			row{
				column{output("Mobile NO")}
				column{output(user.mobileno)}
			}
			row{
				column{output("Address1")}
				column{output(user.address1)}
			}
			row{
				column{output("Address2")}
				column{output(user.address2)}
			}
		</table>
		par{navigate(editProfile()){ "Edit Profile Information" }}
    }
  }
  
define page editProfile(){
	var user: User := securityContext.principal
    main()
    define body(){
    
      section{
        header{"Edit Profile"}
        form{ 
          par{ label("Username"){ output(user.username) } }
          par{ label("First Name"){ input(user.firstname) } }
          par{ label("Last Name"){ input(user.lastname) } }
          par{ label("Birthday"){ input(user.birthdate) } }
          par{ label("Email"){ input(user.email) } }
          
          par{ label("Address Street1"){ input(user.address1) } }
          par{ label("Address Street2"){ input(user.address2) } }
          par{ label("Phone Number"){ input(user.phoneno) } }
          par{ label("Mobile Number"){ input(user.mobileno) } }
//          par{ label("Please enter the text below: "){ captcha() } }
          action("Sign Up", action{  return mypage(); }) 
        }
      }
    }
	
}
module user/user-ui

imports user/user-data
//imports user/test-data

access control rules
  rule page login() { true } 
  rule page signup()   { !isCustomer() && !isShipper() && !isAdministrator() }
  rule page mypage()   { isCustomer() }
  rule page profile(user: User) { isAdministrator() || isCustomer() || isShipper()}
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
	init{ if(loggedIn()) { goto root(); } }
	 
	main()
	define body(){
		signin()
	}
 } 

  define ajax signin() {
    init{ if(loggedIn()) { goto root(); } }
    var username : String
    var password : Secret
    action doit(){ signin(username, password); }
    header{"Sign In"}
    form{
      par{ label("Username"){ input(username) } }
      par{ label("Password"){ input(password) } }
      par{ action("Sign in", doit())[id:=submit,ajax] }
    }
    header{"Register"}
    par{ "No account? " navigate(signup()){ "Register now" } }
  }
  
  
  define signoutLink(){
  	actionLink("Signout", action{ signout(); goto root(); })
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
    init{ if(!loggedIn()) { goto root(); } }
    
    main()
    define body(){
      account(securityContext.principal)
    }
  }
 
  define page profile(user: User){
	init{ if(!loggedIn()) { goto root(); } }
	main
	define body(){
		accountData(user)
	}
  }

  define account(user : User) {
    section{
      header{"Your Account"}
      accountData(user)
      changePassword(user)
//      changeEmailAddress(user)
    }
  }
  
  define accountData(user : User) {
    section{
      header{"Account Data"}
      group{
        groupitem{ label("Your username is:      "){ output(user.username) } }
        groupitem{ label("Your first name:             "){ output(user.firstname) } }
        groupitem{ label("Your last name:             "){ output(user.lastname) } }
        groupitem{ label("Your email address is: "){ output(user.email)    } }
      }
    }
  }
  

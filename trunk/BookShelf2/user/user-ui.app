module user/user-ui

imports user/user-data

access control rules
  rule page login() { true } 
  rule page signup()   { true }
  rule ajaxtemplate signin()   { true }
  
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
      //par{ validate(checkPassword(username, password), "That combination of username and password is not correct.") }
      par{ action("Sign in", doit())[id:=submit,ajax] }
    }
//    forgotPassword()
    header{"Register"}
    par{ "No account? " navigate(signup()){ "Register now" } }
  }
  
  
  define signoutLink(){
  	actionLink("Signout", action{ signout(); })
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
          par{ label("Username: "){ input(user.username) } }
          par{ label("Password: "){ input(user.password) } }
          par{ label("Confirm password: "){ input(password) {
                validate(password == user.password, "Passwords do not match!") } } }
          par{ label("First Name: "){ input(user.firstname) } }
          par{ label("Last Name: "){ input(user.lastname) } }
          par{ label("Gender: "){ input(user.gender) } }
          par{ label("Birthday: "){ input(user.birthdate) } }
          par{ label("Email: "){ input(user.email) } }
          
          par{ label("Address Street1: "){ input(user.address1) } }
          par{ label("Address Street2: "){ input(user.address2) } }
          par{ label("Phone Number: "){ input(user.phoneno) } }
          par{ label("Mobile Number: "){ input(user.mobileno) } }
          par{ label("Please enter the text below: "){ captcha() } }
          action("Sign Up", action{ user.signup(); return root(); }) 
        }
      }
    }
  }

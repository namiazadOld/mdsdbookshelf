KOS
module user/user-data

enum Gender {maleGender("Male"), femaleGender("Female")}


entity User {
    username  :: String (id)
    password  :: Secret
    firstname :: String 
    lastname  :: String
    gender    -> Gender
    birthdate :: Date
    isactive  :: Bool
    email     :: Email
    phoneno   :: String
    mobileno  :: String
    address1   :: String  
    address2   :: String  
    function signup() {
      this.password := this.password.digest();
      this.isactive := true;
      this.save();
      log("Sign Up Log: " + this);
      //email(confirmEmail(this));
      //message("You should receive an email to verify your registration.");
      message("Your registration has been done successfully.");
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
  
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

access control rules
  principal is User with credentials username, password
  rule template *(*) { true }	
 
 section authentication

  function principal() : User { 
    return securityContext.principal;
  }
  
    function checkPassword(username : String, password : Secret) : Bool {
    var user := findUser(username.toLowerCase());
    return user != null && user.password.check(password);
  }
  
  function signin(username : String, password : Secret) : Bool {
    var user := findUser(username.toLowerCase());
    validate(user != null && user.password.check(password), 
             "That combination of username and password is not correct.");
    securityContext.principal := user;  
    return true; 
  }  
  
  function signoff() {
    securityContext.principal := null;
  }
  
  
  section forgot password

  entity NewPassword {
    user -> User
    date :: DateTime
    used :: Bool
    function resetPassword(pw : Secret) {
      validate(!used, "This request is no longer valid");
      validate(user != null, "Error: resetPassword: user == null");
      user.password := pw.digest();
      used := true;
    }
  }

  extend entity User {
    function newPassword() : NewPassword {
      var n := NewPassword{ user := this };
      n.save();
      return n;
    }
    function changePassword(password : Secret) {
      this.password := password.digest();
    }
  }
  
  section groups

  entity Group {
    key     :: String (id)
    name    :: String
    members -> Set<User>
    function isMember(user : User) : Bool { return user in members; }
  }
  extend entity User {
    groups -> Set<Group> (inverse=Group.members)
  }
  
  globals {
    var administratorsGroup := Group{ key := "administrators" name := "Administrators" }
    var customerGroup          := Group{ key := "customers"          name := "Customers"          }
    var shipperGroup       := Group{ key := "shippers"       name := "Shippers"       }
  }
  
  function isAdministrator() : Bool {
    return principal() in administratorsGroup.members;
  }
  function isCustomer() : Bool {
    return principal() in customerGroup.members;
  }
  function isShipper() : Bool {
    return principal() in shipperGroup.members;
  }
 
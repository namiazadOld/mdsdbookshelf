module user/init

access control rules

  rule page initialize() { administratorsGroup.members.length == 0 }

section initialize administrator

define page initialize() {
  var username  : String
  var password1 : Secret
  var password2 : Secret
  var fullname  : String
  var email     : Email
  main{
    header{"Register Administrator"}
    form{
      par{ label("Username"){ input(username)  } }
      par{ label("Password"){ input(password1) } }
      par{ label("Password"){ input(password2) { validate(password1 == password2, "Passwords do not match") } } }
      par{ label("Fullname"){ input(fullname)  } }
      par{ label("Email"   ){ input(email)     } }
      action("Create", action{
        var groups : Set<Group> := {administratorsGroup};
        var user := createUser(username, fullname, email, password1, groups);
        user.password := password1.digest();
        log("created administrator");
        administratorsGroup.members.add(user);
        return root();
      })
    }
  }
}


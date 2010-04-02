module user/admin-ui

imports user/user-data
imports user/user-ui

access control rules
  rule page usermgmt() { isAdministrator() } 
  rule page editUser(user: User){isAdministrator()}
section admin user management

define page editUser(user: User){
    main()
    define body(){
    
      section{
        header{"Edit User"}
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
          par{ label("Is Active?"){ input(user.isactive) } }
//          par{ label("Please enter the text below: "){ captcha() } }
          action("Save", action{  return usermgmt(); }) 
        }
      }
    }
	
}
define page usermgmt(){

	main()
	define body(){
		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("User Name")</th>
					<th scope="col">output("First Name")</th>
					<th scope="col">output("Last Name")</th>
					<th scope="col">output("")</th>

			        </tr>
			</thead>

			for(user :User where user in customerGroup.members){
				row{
					column{navigate(profile(user)){ output(user.username) }}
					column{output(user.firstname)}
					column{output(user.lastname)}
					
					column{
						navigate(editUser(user)){image("/images/edit.png")}
						submitlink action{
			          		if(user.isactive){
			          			user.isactive := false; 
			          		} else{
			          			user.isactive := true;
			          		}
						}  { if(user.isactive){ image("/images/unlock.png")} else { image("/images/lock.png")} } 
					}
				}
	
			}
			
			
			</table>
			
	}
}
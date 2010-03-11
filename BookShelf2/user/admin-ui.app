module user/admin-ui

imports user/user-data
imports user/user-ui

access control rules
  rule page usermgmt() { isAdministrator() } 

section admin user management

define page usermgmt(){

	main()
	define body(){
		list{
			for(user : User) {
				listitem{ 
				navigate(profile(user)){ output(user.username) }
				output("****" + user.lastname) 
				}
			}
		}	
	}
}
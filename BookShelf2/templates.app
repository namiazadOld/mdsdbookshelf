module templates

imports user/user-ui
imports user/user-data
imports user/admin-ui
imports product/book/book-ui
imports product/book/genre-ui

access control rules
	rule action signout() { isAdministrator() }


section main template

define main() {
	includeCSS("layout.css")
	<div id="wrapper">
         <div id="header">
		 
		       mainheader()		 
			   
		 </div>
		 
         	<div id="navigation">
		 
		      <div id="tabs">
		      	applicationmenu()
		      </div>
		</div>
		             
		 <div id="leftcolumn">
			<div class="arrowgreen">
				leftsidemenu()
			</div>
		 
		 </div>
		 <div id="content">
		      
			  body() 
		 
		 </div>
		 <div id="rightcolumn">

		 </div>
		 <div id="footer">
		       		footer()
			   <p />"powered by " <a href="http://webdsl.org">"WebDSL"</a><p />		
			    
	     </div>   </div>
	     
}

define body(){
  "default body"
}

define footer(){
	signinoff()
}
define mainheader() {
  navigate(root()){
    image("/images/logo.jpg")
  }
}



define applicationmenu() {
  //<ul>
//    <li>navigate(root()){"Home"}</li>
 //   <li>navigate(managePerson()){ "Manage Person" }</li>
 // </ul>
 
   <ul>
    <li>navigate(root()){"Home"}</li>
    <li>navigate(managePerson()){ "Manage Person" }</li>
    <li>navigate(signup()){ "Singup" }</li>
    <li>navigate(mypage()){ "My Page" }</li>
    <li>navigate(usermgmt()){ "User Management" }</li>
  </ul>
  
}

define leftsidemenu(){
   <ul>
    <li>navigate(usermgmt()){ "User Management" }</li>
    <li>navigate(createbook()){ "Define New Book" }</li>
    <li>navigate(creategenre()){ "Define New Genre" }</li>
    genreMenu()
  </ul>
}
 
define ignore-access-control errorTemplateInput(messages : List<String>){
  validatedInput
  for(ve: String in messages){
    row[style := "color: #FF0000;border: 1px solid #FF0000;"]{
      column{}
      column{ 
        output(ve)
      }
    }
  }
}
 
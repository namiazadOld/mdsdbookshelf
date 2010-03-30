module product/book/author-ui

imports user/user-data
imports product/book/author-data

access control rules
  rule page createauthor() { isAdministrator() } 
  rule ajaxtemplate searchAuthorAjax(){true}
  rule page unresolvedauthorlist() {isAdministrator()}

section author management

define page unresolvedauthorlist(){
        var boolSet := List<Bool>()
	init{ if(!loggedIn()) { goto root(); } }
	main
	define body(){
		section{
			header { "Resolving Authors" }
			form{
				<table id="gradient-style">
					for(author : UnresolvedAuthor)
					{
						var boolInput : Bool;
						row
						{
							column
							{
								input(boolInput)
							}
							column
							{
								output(author.fullName)
							}
						}
					}
				</table>
			}
		}
	}
}

define ajax searchAuthorAjax(){
  	var author:= Author{}
  	var searchResult := List<Author>()
  	
  	action doit() { 
  		searchResult := searchAuthor(author);
  	}
  	
  	header{"Find an author"}
  	form {
  		 par{ label("First Name "){ input(author.firstName) } }
  		 par{ label("Last Name "){ input(author.lastName) } }
  		 par{ label("Nationality "){ input(author.nationality) } }
  		 par{ label("Gender "){ input(author.gender) } }
  		 par{ action("Search", doit())[id:=submit,ajax] }
  	}
  }

define page createauthor(){
	init{ if(!loggedIn()) { goto root(); } }
	var author:= Author{}
	main
	define body(){
		section{
			header { "Define New Author" }
			form{
				par{ label("First name "){ input(author.firstName) } }
				par{ label("Last name "){ input(author.lastName) } }
				par{ label("Email "){ input(author.email) } }
				par{ label("Gender "){ input(author.gender) } }
				par{ label("Image "){ input(author.image) } }
				par{ label("Death Date "){ input(author.deathDate) } }
				par{ label("Nationality "){ input(author.nationality) } }
				par{ label("Description "){ input(author.description) } }
				action("Create", action{ author.create(); return createauthor(); }) 
			}
		}
	}
  }
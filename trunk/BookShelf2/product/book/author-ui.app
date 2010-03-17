module product/book/author-ui

imports user/user-data
imports product/book/author-data

access control rules
  rule page createauthor() { isAdministrator() } 

section author management

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
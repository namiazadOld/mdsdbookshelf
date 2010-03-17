module product/book/author-ui

imports user/user-data
imports product/book/author-data

access control rules
  rule page createAuthor() { isAdministrator() } 

section author management

define page createauthor(){
	init{ if(!loggedIn()) { goto root(); } }
	var author:= Author{}
	main
	define body(){
		section{
			header { "Define New Author" }
			form{
				par{ label("Title "){ input(book.title) } }
				par{ label("ISBN "){ input(book.isbn13) } }
				par{ label("Front Image "){ input(book.frontImage) } }
				par{ label("Back Image "){ input(book.backImage) } }
				par{ label("Table of Content "){ input(book.tableOfContent) } }
				par{ label("Publication Date "){ input(book.publicationDate) } }
				par{ label("Edition "){ input(book.edition) } }
				par{ label("Hard Copy Available Count "){ input(book.hardCopyAvailableCount) } }
				par{ label("EBook Coppy Available Count "){ input(book.eBookAvailableCount) } }
				par{ label("Discount "){ input(book.discount) } }
				par{ label("Description "){ input(book.description) } }
				par{ label("Genre "){ input(book.genre) } }
				action("Create", action{ book.create(); return createbook(); }) 
			}
		}
	}
  }
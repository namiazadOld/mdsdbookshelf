module product/book/book-ui

imports user/user-data
imports product/book/book-data
imports product/book/author-data
imports product/book/author-ui
imports product/order/order-ui

access control rules
  rule page createbook() { isAdministrator() } 
  rule page bookList( genre: Genre) {!isAdministrator()}
section book management



define page createbook(){
	init{ if(!loggedIn()) { goto root(); } }
	var book:= Book{}
	var authorName : String
	main
	define body(){
	placeholder testph{ "no details shown" }
		
		section{
			header { "Define New Book" }
			form{
				par{ label("Title "){ input(book.title) } }
				
				<div id="authorInfo">
				table{
     					row{
      						column{ label("Author ") {input(authorName)}}
      						column{
      							action("show details",show())[ajax]
      							action show(){
    								replace(testph,searchAuthorAjax());
  							}			
						      }
						column {
							//action("Create", action{ book.create();})
							}
     					} 
   				}
   				</div>
				
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
 
   define bookDetail(book : Book){
  	<div id="bookDetail">
  		table{
  			row{
  				column{	output(book.frontImage)	}
  				column{ 
					  				
	  				header{output(book.title)}	
	  				par[class :="className" ]{	output("Somthing else" +book.title)	}
	  				par{	output("Publisher" + book.publisher )}
  				}
  				column{ par{navigate(newOrderItem(book)){image("/images/addcart.png")	}}}
  			}	
  		}
  		
  		
  	</div>
  } 
  define page bookList(genre : Genre){
  		main()
	define body(){
		for(book :Book in genre.bookList) {
			bookDetail(book) 
			
		}
	
	}
  }
  

  
module product/book/book-ui

imports user/user-data
imports product/book/book-data
imports product/book/author-data
imports product/book/author-ui
imports product/book/utils-data
imports product/order/order-ui

access control rules
  rule page createbook() { isAdministrator() } 
  rule page bookList( genre: Genre) {!isAdministrator()}
section book management



define page createbook(){
	init{ if(!loggedIn()) { goto root(); } }
	var book:= Book{}
	var authors : String
	var cs := CustomString {};
	var parts : List<String>;
	main
	define body(){	
		section{
			header { "Define New Book" }
			form{
				par{ label("Title "){ input(book.title) } }
				par {label ("Authors ") {input(authors)}}
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
				action("Create", action{ 
					book.create();
					parts := authors.split(",");
					book.unresolvedAuthorList := List<CustomString>();
					
					for (p: String in parts)
					{
						cs := CustomString {};
						cs.content := p;
						book.unresolvedAuthorList.add(cs);
					}
					
					return createbook(); 
					}) 
				
			}
		}
	}
  }
 
   define bookDetail(book : Book){
        var authorString : String
        var count := 0
   	init {
 		if (book.unresolvedAuthorList != null)
 		{
 			for (author: CustomString in book.unresolvedAuthorList)
 			{
 				authorString := authorString + author.content;
 				count := count + 1;
 				
 				if (count < book.numberOfAuthors())
 				{
 					authorString := authorString + ", ";
 				}
 			}
 			
 		}  
 		
 		if (book.authorList != null)
 		{
 			for (author: Author in book.authorList)
 			{
 				authorString := authorString + author;
 				count := count + 1;
 				
 				if (count < book.numberOfAuthors())
 				{
 					authorString := authorString + ", ";
 				}
 			}
 			
 		}  		
   	}
  	<div id="bookDetail">
  		table{
  			row{
  				column{	output(book.frontImage)	}
  				column{ 
					  				
	  				header{output(book.title)}	

	  				par[class :="className" ]{	output(book.title)	}
	  				par{	output("Publisher" + book.publisher )}
	  				par{ output ("By: " + authorString)}
  				}
//  				column{ par{navigate(newOrderItem(book)){image("/images/addcart.png")	}}}
  				column{ par{navigate(testPage(book)){image("/images/addcart.png")	}}}
  			}	
  		}
  		
  		
  	</div>
  } 
  define page testPage(book : Book ){
  	main
  	define body(){
  			//orderView(ord)
		output("salam")
		output(book.title)
  	}
  }
  define page bookList(genre : Genre){
  		main()
	define body(){
		for(book :Book in genre.bookList) {
			bookDetail(book) 
			
		}
	
	}
  }
  

  
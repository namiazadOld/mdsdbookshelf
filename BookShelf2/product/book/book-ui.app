module product/book/book-ui

imports user/user-data
imports product/book/book-data
imports product/book/author-data
imports product/book/author-ui
imports product/order/order-ui

access control rules
  rule page createbook() { isAdministrator() }
   rule page editBook(book: Book) { isAdministrator() }
  rule page bookList( genre: Genre) {!isAdministrator()}
  rule page searchResult (searchString : String) {true}
  rule page testPage( book: Book) {true}
 
section book management



define page createbook(){
	init{ if(!loggedIn()) { return root(); } }
	var book:= Book{}
	var authors : String
	var cs := UnresolvedAuthor {};
	var parts : List<String>;
	main
	define body(){	
		section{
			header { "Define New Book" }
			form{
				par{ label("Title "){ input(book.title) } }
				par {label ("Authors ") {input(authors)}}
				par {label ("Price ") {input(book.price)}}
				par{ label("ISBN "){ input(book.isbn13) } }
				par{ label("Front Image "){ input(book.frontImage) } }
				par{ label("Back Image "){ input(book.backImage) } }
				par{ label("Table of Content "){ input(book.tableOfContent) } }
				par{ label("Publisher "){ input(book.publisher) } }
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
					book.unresolvedAuthorList := List<UnresolvedAuthor>();
					
					for (p: String in parts)
					{
						cs := UnresolvedAuthor {};
						cs.fullName := p;
						book.unresolvedAuthorList.add(cs);
					}
					
					return createbook(); 
					}) 
				
			}
		}
	}
  }
  
define page editBook(book: Book){
	init{ if(!loggedIn()) { return root(); } }

	var authors : String
	var cs := UnresolvedAuthor {};
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
				par{ label("Publisher "){ input(book.publisher) } }
				par{ label("Publication Date "){ input(book.publicationDate) } }
				par{ label("Edition "){ input(book.edition) } }
				par{ label("Hard Copy Available Count "){ input(book.hardCopyAvailableCount) } }
				par{ label("EBook Coppy Available Count "){ input(book.eBookAvailableCount) } }
				par{ label("Discount "){ input(book.discount) } }
				par{ label("Description "){ input(book.description) } }
				par{ label("Genre "){ input(book.genre) } }
				action("Save", action{ 
					parts := authors.split(",");
					book.unresolvedAuthorList := List<UnresolvedAuthor>();
					
					for (p: String in parts)
					{
						cs := UnresolvedAuthor {};
						cs.fullName := p;
						book.unresolvedAuthorList.add(cs);
					}
					
					return bookList(book.genre); 
					}) 
				
			}
		}
	}

}
define page book(book: Book){
	
}
    
 
   define bookDetail(book : Book){
        var authorString : String
        var count := 0
   	init {
 		if (book.unresolvedAuthorList != null)
 		{
 			for (author: UnresolvedAuthor in book.unresolvedAuthorList)
 			{
 				authorString := authorString + author.fullName;
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
 				authorString := authorString + author.name;
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
	  				par{ output("Publisher: " + book.publisher )}
	  				par{ output ("By: " + authorString)}
  				}
  				if(book.hardCopyAvailableCount > 0){
  					column{ par{navigate(newOrderItem(book)){image("/images/addcart.png")	}}}
  				} else {
  					column{ par{output("Currently Not Available") }}
  				}
//  				column{ par{navigate(editBook(book)){image("/images/edit.png")	}}}
//  				column{ column{deleteBook(book)} }
//  				column{ par{navigate(testPage(book)){image("/images/addcart.png")	}}}
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
  
  
define deleteBook(book: Book){
  	actionLink("Remove", action{ book.delete(); })
  }
  
  
  
  define page searchResult(searchString : String){
  	var books : List<Book> := searchBook(searchString)
  	main()
	define body(){
		for(book :Book in books) {
			bookDetail(book) 
			//output(book.authors)
		}
	}
  	
  }
  


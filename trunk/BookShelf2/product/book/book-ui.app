module product/book/book-ui

imports user/user-data
imports product/book/book-data
imports product/book/author-data
imports product/book/author-ui
imports product/order/order-ui

access control rules
  rule page createbook() { isAdministrator() }
  rule page editbook(book: Book) { isAdministrator() }
  rule page bookList( genre: Genre) {!isAdministrator()}
  rule page searchResult (searchString : String) {true}
  rule page testPage( book: Book) {true}
  rule page bookListByAuthor(author : Author) {true}
 
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
  
define page editbook(book: Book){
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
        var resolvedAuthorList : List<Author>
        var count := 0
   	init 
   	{
 		if (book.authorList != null)
 		{
 			resolvedAuthorList := book.authorList.list();
 		}
   	}
  	<div id="bookDetail">
  		table{
  			row{
  				column{	output(book.frontImage)	}
  				column{ 
					  				
	  				header{output(book.title)}	

	  				//par[class :="className" ]{	output(book.title)	}
	  				par{ output("Publisher: " + book.publisher )}
	  				par
	  				{
	  					if (resolvedAuthorList != null)
				 		{
				 			for(id:Int from 0 to resolvedAuthorList.length)
				 			{
				 				navigate(authordetail(resolvedAuthorList.get(id))){output(resolvedAuthorList.get(id).name)}
				 				if (id + 1 < book.numberOfAuthors())
				 				{
				 					output(", ")
				 				}
				 			}
				 		}  		
				 		
				 		if (book.unresolvedAuthorList != null)
				 		{
				 			for(id:Int from 0 to book.unresolvedAuthorList.length)
				 			{
				 				output(book.unresolvedAuthorList.get(id).fullName)
				 				if (id + 1 < book.unresolvedAuthorList.length)
				 				{
				 					output(", ")
				 				}
				 			}
				 		}  
	  				}
	  				par{navigate(editbook(book)){"Edit"}}
	  				par
	  				{
	  					if (isAdministrator())
	  					{
	  						submitlink action
							{
					          	if (book.mayRemove())
					          	{
					          		book.remove();
					          		message("Book has been deleted successfully.");
					          		return root();
					          	}
					          	else
					          	{
					          		message("Book has history in orders then it cannot be removed.");
					          		return editbook(book);
					          	}
	
							}{ output("Remove")} 
	  					}
	  					
	  				}			
  				if(book.hardCopyAvailableCount > 0){
					column{ 
							submitlink action{
								var order: Order := createOrderItem(book);
								return viewInProgressOrder(order);
						          } { image("/images/addcart.png") }
					}
  				} else {
  					column{ par{output("Currently Not Available") }}
  				}	  
  				}
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
  
  define page bookListByAuthor(author : Author)
  {
  	main()
	define body()
	{
		for(book :Book in author.bookList)
		{
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
  


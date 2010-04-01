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
  rule page book(book : Book, selectedTab : String){true}
 
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

define page book(book: Book, selectedTab: String){
	main()
	define body()
	{
		section
		{
			table
			{
				row
				{
					header { output(book.title) }
				}
				row
				{
					column
					{
						output(book.frontImage)
					}
					column
					{
						output(book.backImage)
					}
				}
				row
				{
					column
					{
						par{ output("ISBN: " + book.isbn13)  }
					}
				}
				row
				{
					column
					{
						par{ output("Genre: " + book.genre.title)  }
					}
				}
				row
				{
					column
					{
						par{ output("Summary: " + book.description)  }
					}
				}
			}
			<div id = "tabs2">
							<ul>
							case (selectedTab)
							{
								""
								{
									<li class="selected">navigate(book(book, "")){"Table of Content"}</li>
									<li>navigate(book(book, "author")){"About Author"}</li>
									<li>navigate(book(book, "availability")){"Availability"}</li>
									<li>navigate(book(book, "publication")){"Publication"}</li>
								}
								"author"
								{
									<li>navigate(book(book, "")){"Table of Content"}</li>
									<li class="selected">navigate(book(book, "author")){"About Author"}</li>
									<li>navigate(book(book, "availability")){"Availability"}</li>
									<li>navigate(book(book, "publication")){"Publication"}</li>
								}
								"availability"
								{
									<li>navigate(book(book, "")){"Table of Content"}</li>
									<li>navigate(book(book, "author")){"About Author"}</li>
									<li class="selected">navigate(book(book, "availability")){"Availability"}</li>
									<li>navigate(book(book, "publication")){"Publication"}</li>
								}
								"publication"
								{
									<li>navigate(book(book, "")){"Table of Content"}</li>
									<li>navigate(book(book, "author")){"About Author"}</li>
									<li>navigate(book(book, "availability")){"Availability"}</li>
									<li class="selected">navigate(book(book, "publication")){"Publication"}</li>
								}
							}
								
							</ul>
						</div>		
						case (selectedTab)
							{
								""
								{
									par
									{
										if (book.tableOfContent == "")
										{
											output("Unavailable")
										}
										else
										{
											output(book.tableOfContent)
										}
									}
								}
								"author"
								{
									<table id="gradient-style">
									<thead>
										<tr>
											<th scope="col">output("Name")</th>
											<th scope="col">output("Nationality")</th>
									        </tr>
									</thead>
						
									for (author: Author in book.authorList)
									{
										row
										{
											column{navigate(authordetail(author)){output(author.name)}}
											column{output(author.nationality)}
										}
									}
									
									for(author: UnresolvedAuthor in book.unresolvedAuthorList)
									{
										row
										{
											column{output(author.fullName)}
											column{output("Unavailable")}
										}
									}
									</table>
								}
								"availability"
								{
									<table id="gradient-style">
									<thead>
										<tr>
											<th scope="col">output("")</th>
											<th scope="col">output("")</th>
									        </tr>
									</thead>
						
									row
									{
										column{output("Price")}
										column{output(book.price)}
									}
									row
									{
										column{output("Available hard copies")}
										column{output(book.hardCopyAvailableCount)}
									}
									row
									{
										column{output("Available ebooks")}
										column{output(book.eBookAvailableCount)}
									}
									row
									{
										column{output("Discount")}
										column{output(book.discount)}
									}
									</table>
								}
								"publication"
								{
									<table id="gradient-style">
									<thead>
										<tr>
											<th scope="col">output("")</th>
											<th scope="col">output("")</th>
									        </tr>
									</thead>
						
									row
									{
										column{output("Edition")}
										column{output(book.edition)}
									}
									row
									{
										column{output("Publisher")}
										column{output(book.publisher)}
									}
									row
									{
										column{output("Publication Date")}
										column{output(book.publicationDate)}
									}
									</table>
								}
							}	
		}
	}	
}
    
 
define bookDetail(book : Book)
{
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
  				column {navigate(book(book, "")){output(book.frontImage)}}
  				column{ 
					  				
	  				header{navigate(book(book, "")){output(book.title)}}	

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
								if (book.remove())
								{
									return root();
								}
								else
								{
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
  


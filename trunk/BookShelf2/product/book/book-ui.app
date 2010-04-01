module product/book/book-ui

imports user/user-data
imports product/book/book-data
imports product/book/author-data
imports product/book/author-ui
imports product/order/order-ui
imports product/book/comment-ui

access control rules
  rule page createbook() { isAdministrator() }
  rule page editbook(book: Book) { isAdministrator() }
  rule page bookList( genre: Genre) {true}
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
	var newComment : String
	main()
	define body()
	{
		section
		{
			form
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
						par{<strong> output("ISBN: " )</strong> output( book.isbn13 )}
					}
				}
				row
				{
					column
					{
						par{<strong> output("Genre: " )</strong> output( book.genre.title )}
					}
				}
				row
				{
					column
					{
						par{<strong> output("Summary: " )</strong> output( book.description )}
					}
				}
				
				
				if (book.mayEdit() || book.mayRemove())
				{
					row
					{
						column
						{
							if (book.mayEdit())
							{
								submitlink action
								{
									return editbook(book);
								}{ output("Edit ")} 
							}
							
							if (book.mayRemove())
							{
								submitlink action
								{
									book.remove();
									return root();
								}{ output("Remove")} 
							}
						}
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
					<li>navigate(book(book, "comment")){"Comments"}</li>
				}
				"author"
				{
					<li>navigate(book(book, "")){"Table of Content"}</li>
					<li class="selected">navigate(book(book, "author")){"About Author"}</li>
					<li>navigate(book(book, "availability")){"Availability"}</li>
					<li>navigate(book(book, "publication")){"Publication"}</li>
					<li>navigate(book(book, "comment")){"Comments"}</li>
				}
				"availability"
				{
					<li>navigate(book(book, "")){"Table of Content"}</li>
					<li>navigate(book(book, "author")){"About Author"}</li>
					<li class="selected">navigate(book(book, "availability")){"Availability"}</li>
					<li>navigate(book(book, "publication")){"Publication"}</li>
					<li>navigate(book(book, "comment")){"Comments"}</li>
				}
				"publication"
				{
					<li>navigate(book(book, "")){"Table of Content"}</li>
					<li>navigate(book(book, "author")){"About Author"}</li>
					<li>navigate(book(book, "availability")){"Availability"}</li>
					<li class="selected">navigate(book(book, "publication")){"Publication"}</li>
					<li>navigate(book(book, "comment")){"Comments"}</li>
				}
				"comment"
				{
					<li>navigate(book(book, "")){"Table of Content"}</li>
					<li>navigate(book(book, "author")){"About Author"}</li>
					<li>navigate(book(book, "availability")){"Availability"}</li>
					<li>navigate(book(book, "publication")){"Publication"}</li>
					<li class="selected">navigate(book(book, "comment")){"Comments"}</li>
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
				"comment"
				{
					
					table
					{
						for (comment : Comment in book.commentList)
						{
							row
							{
								column
								{
									commentdetail(comment)
								}
								
								column
								{
									if (comment.mayRemove())
									{
										submitlink action
										{
											comment.remove();
											return book(book, "comment");
										}{ output("Remove")} 
									}
								}
							}
							
						}
					}
					
					if (book.mayPostComment())
					{
						par{ label("Post your comment "){ input(newComment) } }
						submit postComment(newComment) {"Send" }
					}
				}
			}
		}
				
	}
  }	
	
	action postComment(input : String)
	{
		book.postComment(input);
		return book(book, "comment");
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
	  					if (book.mayRemove())
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
								var order: Order := createOrderItem(book, null as SpecialOffer);
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
//		for(book :Book in genre.bookList) {
//			bookDetail(book) 
//			
//		}
		printBookList(genre.bookList.list())
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

define printBookList(books: List<Book>){
  	var boolInputs : List<CustomBool>
  	var tbool : CustomBool
  	var specialOffer:= SpecialOffer{}
	init{
		for(id:Int from 0 to books.length)
		{
			var entry:= CustomBool{};
			entry.content := false;
			boolInputs.add(entry);
		}		
	}
  		if(!isAdministrator()){
			for(book :Book in books) {
				bookDetail(book) 
				//output(book.authors)
			}
		}
		else{
			// bookDetailTemp.
			form{
				par{
					submit addToSpecialOfferAction(specialOffer, books, boolInputs) {"Add selected to offer" }
					input(specialOffer)
				}	
				<hr/>
				for(id:Int from 0 to books.length)
				{
			  		<table>
			  			row{
			  				if(isAdministrator()){
			  					column{	input(boolInputs.get(id).content)}
			  				}
			  				
							column{bookDetail(books.get(id) )}
						}
					 </table>
					//output(book.authors)
				
				}
			}
		}
		action addToSpecialOfferAction(specialOffer : SpecialOffer, books: List<Book>, boolInputs : List<CustomBool>){
			log("Add to special offer action called.");
		  	for(id:Int from 0 to books.length){
		  		if(boolInputs.get(id).content){
		  			specialOffer.items.add(books.get(id));
		  			
		  		}
		  	}
		  	return editSpecialOffer(specialOffer);
		}
		  	
  }
  

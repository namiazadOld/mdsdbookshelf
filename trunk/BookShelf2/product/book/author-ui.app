module product/book/author-ui

imports user/user-data
imports product/book/author-data
imports product/book/util-data

access control rules
  rule page createauthor() { isAdministrator() } 
  rule page resolvedauthorsearch() {isAdministrator()}
  rule page resolvedauthorselection(inputSearch : String) {isAdministrator()}
  rule page unresolvedauthorsearch(author : Author) {isAdministrator()}
  rule page unresolvedauthorselection(inputSearch : String, author: Author) {isAdministrator()}
  rule page authordetail(author: Author) {true}

section author management

define page authordetail(author: Author)
{
	var life : String
	init
	{
		life := author.birthDate + " - " + author.deathDate;
		// life := "";
		
		//if (author.deathDate != null)
		// {
			// if (author.birthDate == null)
			// {
				// life := "Unknown - " + author.deathDate; 
			// }
			// else
			// {
				// life := author.birthDate.toString() + " - " + author.deathDate.toString();
			// }
		// }
		// else
		// {
			// if (author.birthDate == null)
			// {
				// life := "";
			// }
			// else
			// {
				// life := author.birthDate + " - present";
			// }
		// }
	}
	main()
	define body()
	{
		<div id="authorDetail">
  		table{
  			row{
  				column{	output(author.image)	}
  				column{ 
	  				header{output(author.name)}	
	  				par{ output(life)}
	  				par {output(author.description)}
	  				if (author.bookList.length == 0)
	  				{
	  					par{ output("No book currently available from this author")}
	  				}
	  				else
	  				{
	  					par {navigate(root()){"Available books from this author"}}
	  				}
  				}
  			}	
  		}  		
  		</div>
	}
}


define page resolvedauthorsearch()
{
	var inputSearch : String
	main()
	define body()
	{
		section
		{
			form{
				par{ label("Search for resolved author: "){ input(inputSearch) } }
				action("Go!", action{ 
				return resolvedauthorselection(inputSearch); })
			}
		}
	}	
}

define page unresolvedauthorsearch(author : Author)
{
	var inputSearch : String
	main()
	define body()
	{
		section
		{
			form{
				par{ label("Search for unresolved author: "){ input(inputSearch) } }
				action("Go!", action{ 
				return unresolvedauthorselection(inputSearch, author); })
			}
		}
	}	
}

define page unresolvedauthorselection(inputSearch : String, author: Author)
{
	var authors : List<UnresolvedAuthor> := searchUnresolvedAuthor(inputSearch)
	var boolInputs : List<CustomBool>;
	init
	{
		if (authors.length == 0)
		{
			message("No author was found!");
			return unresolvedauthorsearch(author);
		}
			
		for(id:Int from 0 to authors.length)
		{
			var entry:= CustomBool{};
			entry.content := false;
			boolInputs.add(entry);
		}
	}
	
	main()
	define body(){
		section
		{
			form{
				<table id="gradient-style">
					for(id:Int from 0 to authors.length)
					{
						row
						{
							column
							{
								input(boolInputs.get(id).content)
							}
							column
							{
								output(authors.get(id).name)
							}
						}
					}
				</table>
				submit unresolvedAuthorSelectionAction(author, authors, boolInputs, inputSearch) {"Next" }
			}
		}
		action unresolvedAuthorSelectionAction(author: Author, authors : List<UnresolvedAuthor>, inputs : List<CustomBool>, inputSearch : String)
		{
			var index : Int;
			var count : Int := 0;
			
			for(id:Int from 0 to inputs.length)
			{
				if (inputs.get(id).content == true)
				{
					count := count + 1;
					index := id;
				}
			}
			
			if (count == 0)
			{
				message("At least one unresolved author should be selected!");
				return unresolvedauthorselection(inputSearch, author);
			}
			
			for(unResAuthor: UnresolvedAuthor in authors)
			{
				if (inputs.get(authors.indexOf(unResAuthor)).content == true)
				{
					// message(unResAuthor.fullName);
					var book : Book := unResAuthor.book;
					book.unresolvedAuthorList.remove(unResAuthor);
					book.authorList.add(author);
					unResAuthor.delete();
				}
			}
			
			message("Merging process was done successfully.");
			return resolvedauthorsearch();
		}
	}
}

define page resolvedauthorselection(inputSearch : String)
{
	var authors : List<Author> := searchAuthor(inputSearch)
	var boolInputs : List<CustomBool>;
	init 
	{
		if (authors.length == 0)
		{
			message("No author was found!");
			return resolvedauthorsearch();
		}
			
		for(id:Int from 0 to authors.length)
		{
			var entry:= CustomBool{};
			entry.content := false;
			boolInputs.add(entry);
		}
	}
	
	main()
	define body(){
		section
		{
			form{
				<table id="gradient-style">
					for(id:Int from 0 to authors.length)
					{
						row
						{
							column
							{
								input(boolInputs.get(id).content)
							}
							column
							{
								output(authors.get(id).name)
							}
						}
					}
				</table>
				submit resolvedAuthorSelectionAction(authors, boolInputs, inputSearch) {"Next" }
			}
		}
	}
	action resolvedAuthorSelectionAction(authors : List<Author>, inputs : List<CustomBool>, inputSearch : String)
	{
		var index : Int;
		var count : Int := 0;
		
		for(id:Int from 0 to inputs.length)
		{
			if (inputs.get(id).content == true)
			{
				count := count + 1;
				index := id;
			}
			
			if (count == 0)
			{
				message("One author should be selected!");
				return resolvedauthorselection(inputSearch);
			}
			
			if (count > 1)
			{
				message("Only one author should be selected!");
				return resolvedauthorselection(inputSearch);
			}
		}
		
		return unresolvedauthorsearch(authors.get(index));
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
				par{ label("Birth Date "){ input(author.birthDate) } }
				par{ label("Death Date "){ input(author.deathDate) } }
				par{ label("Nationality "){ input(author.nationality) } }
				par{ label("Description "){ input(author.description) } }
				action("Create", action{ author.create(); return createauthor(); }) 
			}
		}
	}
  }
  
    
  
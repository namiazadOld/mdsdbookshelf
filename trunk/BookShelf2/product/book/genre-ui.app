module product/book/genre-ui

imports user/user-data
imports product/book/genre-data

access control rules
  rule page creategenre() { isAdministrator() }
  rule page genrelist() {isAdministrator()} 
  rule page editgenre(genre: Genre) {isAdministrator()}
section genre management

define page creategenre(){
	init{ if(!loggedIn()) { goto root(); } }
	var genre:= Genre{}
	main
	define body(){
		section{
			header { "Define New Genre" }
			form{
				par{ label("Title "){ input(genre.title) } }
				par{ label("Description "){ input(genre.description) } }
				action("Create", action{ genre.create(); return creategenre(); }) 
			}
		}
	}
  }
  
  define page editgenre(genre: Genre)
  {
  	init{ if(!loggedIn()) { goto root(); } }
  	main
	define body(){
		section{
			header { "Define New Genre" }
			form{
				par{ label("Title "){ input(genre.title) } }
				par{ label("Description "){ input(genre.description) } }
				action("Save", action{ genre.save(); return genrelist(); }) 
			}
		}
	}
  }
  
  define page genrelist()
  {
  	init{ if(!loggedIn()) { goto root(); } }
	main()
	define body(){
		<table id="gradient-style">
			<thead>
				<tr>
					<th scope="col">output("Genre")</th>
					<th scope="col">output("Description")</th>
					<th scope="col">output("")</th>
					<th scope="col">output("")</th>
			        </tr>
			</thead>

			for(genre :Genre ){
				row{
					column{navigate(bookList(genre)){output(genre.title)}}
					column{output(genre.description)}
					column{navigate(editgenre(genre)){image("/images/edit.png")}}
					column 
					{
						submitlink action
						{
				          	if (genre.bookList.length == 0)
				          	{
				          		genre.delete();
				          	}
				          	else
				          	{
				          		message("If there is no book defined in a genre, that genre can be removed.");
				          	}
				          	return genrelist();
						}{ image("/images/remove.gif")} 
					}
					
				}
			}
			</table>
	}
  }
  
  define genreMenu(){
  		for (genre: Genre){
  			<li>navigate(bookList(genre)){ output(genre.title) }</li>
  		}
  }
  
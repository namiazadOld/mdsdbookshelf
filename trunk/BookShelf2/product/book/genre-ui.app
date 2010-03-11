module product/book/genre-ui

imports user/user-data
imports product/book/genre-data

access control rules
  rule page creategenre() { isAdministrator() } 
  rule page genreProfile(genre: Genre) { !isAdministrator() } 

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
  
  define page genreProfile(genre : Genre){
  	main
  	define body(){
  		section{
  			form{ 
  				par{ output(genre.title)}
  				par{ output(genre.description)}
  			}
  		}
  	}
  }
  
  define genreMenu(){
  		for (genre: Genre){
  			<li>navigate(genreProfile(genre)){ output(genre.title) }</li>
  		}
  }
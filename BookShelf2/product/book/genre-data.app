module product/book/genre-data

entity Genre{

	title :: String (id, name)
	description :: String
	bookList  -> Set<Book> (inverse = Book.genre)
	function create(){
		this.save();
		log("Category Creation Log: " + this);
		message ("Category has been created successfully.");
	}

}
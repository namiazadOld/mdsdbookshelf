module product/book/book-data

entity Book{

	title :: String (name, validate(title.length() != 0, "Name is mandatory field"))
	isbn13 :: String (id, validate(/\d{3}-\d{1}-\d{6}-\d{2}-\d{1}/.match(isbn13), "BookShelf only supports isbn13"))
	frontImage :: Image
	backImage :: Image
	tableOfContent :: WikiText
	publisher :: String
	publicationDate :: Date
	edition :: String
	hardCopyAvailableCount :: Int
	eBookAvailableCount :: Int
	discount :: Float
	description :: String
	genre 	-> Genre
	//authorList -> Set<Author> (inverse = Author.bookList)
	author -> Author (inverse = Author.bookList)
	function create(){
		this.save();
		this.frontImage.resize(200,128);
		this.backImage.resize(200,128);		
		log("Book Creation Log: " + this);
		message("Book has been created successfully.");
	}
}

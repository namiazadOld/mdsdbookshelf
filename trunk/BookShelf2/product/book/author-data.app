module product/book/author-data

imports user/user-data

function searchAuthor(author : Author) :  List<Author>{
    return null;
  }  

entity UnresolvedAuthor{
	fullName :: String
}

entity Author{

	firstName :: String
	lastName :: String
	email :: Email
	name :: String := firstName + lastName
	gender    -> Gender
	image :: Image
	deathDate :: Date
	nationality :: String
	description :: String	
	bookList -> Set<Book>
	function create(){
		this.save();
		this.image.resize(200,128);
		log("Author Creation Log: " + this);
		message("Author record has been created successfully.");
	}
}
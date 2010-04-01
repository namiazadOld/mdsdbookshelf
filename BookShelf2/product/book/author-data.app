module product/book/author-data

imports user/user-data

function searchAuthor(author : Author) :  List<Author>{
    return null;
  }  

entity UnresolvedAuthor{
	fullName :: String (name, searchable)
	book -> Book
}

function validateDate(birthDate : Date, deathDate: Date) : Bool
{
	if (birthDate == null)
	{
		return true;
	}
	
	if (deathDate == null)
	{
		return true;
	}
	
	if (deathDate.after(birthDate))
		{
			return true;
		}
	return false;
}

entity Author{

	firstName :: String
	lastName :: String (validate(lastName.length() != 0, "Lastname is mandatory field"))
	email :: Email
	name :: String(searchable, name) := firstName + " " + lastName 
	gender    -> Gender
	image :: Image
	birthDate :: Date 
	deathDate :: Date (validate(validateDate(birthDate, deathDate), "Death date is not valid"))
	nationality :: String
	description :: String	
	bookList -> Set<Book>
	
	function mayRemove() : Bool
	{
		return this.bookList.length == 0;
	}
	
	function create(){
		this.save();
		if (this.image != null)
		{
			this.image.resize(200,128);
		}
		log("Author Creation Log: " + this);
		message("Author record has been created successfully.");
	}
	
	function resizeImage(x: Int, y: Int)
	{
		this.image.resize(x, y);
	}
	
	function remove() : Bool
	{
		if (this.mayRemove())
		{
			this.delete();
			message("Author has been deleted successfully.");
			return true;
		}
		message("If there is no book wrote by this author, that author can be removed.");
		return false;
	}
}
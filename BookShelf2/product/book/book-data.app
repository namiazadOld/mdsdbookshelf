module product/book/book-data
imports product/order/order-data



entity Book{

	title :: String (name, validate(title.length() != 0, "Name is mandatory field"), searchable)
	isbn13 :: String (id, validate(/\d{3}-\d{1}-\d{6}-\d{2}-\d{1}/.match(isbn13), "BookShelf only supports isbn13"), searchable)
	price  :: Float
	frontImage :: Image
	backImage :: Image
	tableOfContent :: WikiText
	publisher :: String (searchable)
	publicationDate :: Date
	edition :: String
	hardCopyAvailableCount :: Int
	eBookAvailableCount :: Int
	discount :: Float
	description :: String (searchable)
	genre 	-> Genre
	authorList -> Set<Author> (inverse = Author.bookList)
	unresolvedAuthorList -> List<UnresolvedAuthor> (inverse = UnresolvedAuthor.book)
	orderItemList -> List<OrderItem>(inverse = OrderItem.book)
	
	authors :: String (searchable) := allAuthorsString()
	
	function mayRemove() : Bool
	{
		return orderItemList.length == 0;
	}
	
	function allAuthorsString() : String{
		var result := "";
		
		if (this.unresolvedAuthorList != null)
		{
			for (author: UnresolvedAuthor in this.unresolvedAuthorList)
			{
				result := result + author.fullName + " ";
			}
		}
			
		if (this.authorList != null)
		{
			for (author: Author in this.authorList)
			{
				result := result + author.name + " ";
			}
		}
		return result;
	}
	
	function create(){
		this.save();
		if (this.frontImage != null)
		{
			this.frontImage.resize(200,128);
		}
		if (this.backImage != null)
		{
			this.backImage.resize(200,128);	
		}	
		log("Book Creation Log: " + this);
		message("Book has been created successfully.");
	}
	
	function numberOfAuthors() : Int
	{
		var count := 0;
		
		if (this.unresolvedAuthorList != null)
		{
			count := count + this.unresolvedAuthorList.length;
		}
			
		if (this.authorList != null)
		{
			count := count + this.authorList.length;
		}
		
		return count;
	}
	
	function remove() : Bool
	{
		if (this.mayRemove())
		{
			this.authorList.clear();
			this.unresolvedAuthorList.clear();
			this.delete();
			message("Book has been deleted successfully.");
			return true;
		}
		message("Book has history in orders then it cannot be removed.");
		return false;
		
	}
}


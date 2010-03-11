module book/book-data

function validateIsbn(isbn13: String) : Bool
{
	
}

entity Book{

	isbn13 :: String (id, validate(/\d{3}-\d{1}-\d{6}-\d{2}-\d{1}/.match(isbn), "BookShelf only supports isbn13"))
	frontImage :: Image
	backImage :: Image
	tableOfContent :: WikiText
	name :: String (name, validate(name.length() != 0, "Name is mandatory field"))
	publisher :: String
	publicationDate :: Date
	edition :: String
	hardCopyAvailableCount :: Int
	eBookAvailableCount :: Int
	discount :: Float
	description :: String
}

module product/book/genre-data

entity Genre{

	title :: String (id, name)
	description :: String
	
	function create(){
		this.save();
		log("Category Creation Log: " + this);
		message ("Category has been created successfully.");
	}

}
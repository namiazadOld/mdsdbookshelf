module product/book/comment-data
imports user/user-data
imports product/book/book-data

entity Comment{

	content :: String (name, validate(content.length() != 0, "Your comment is empty!"), not null)
	postDate :: Date
	sender -> User
	book -> Book
	function create(){
		this.save();
		sender := principal();
		log("Comment Creation Log: " + this);
		message ("Comment has been submitted successfully.");
	}

	function mayRemove() : Bool
	{
		return isAdministrator() || principal() == this.sender;
	}
	function remove()
	{
		this.sender := null;
		this.book := null;
		this.delete();
	}
}
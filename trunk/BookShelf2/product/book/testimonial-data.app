module product/book/testimonial-data
imports user/user-data
imports product/book/book-data


function getTheMostUpToDateTestimonial() : Testimonial
{
	var testimonials : List<Testimonial> := from Testimonial as t where t.postDate = (select max(t.postDate) from Testimonial as t);

	if (testimonials != null && testimonials.length != 0)
	{
		return testimonials.get(0);
	}
	
	return null;
}

function mayPostTestimonial() : Bool
{
	return !isAdministrator() && loggedIn();
}

entity Testimonial{

	content :: WikiText (name, validate(content.length() != 0, "Your testimonial is empty!"), not null)
	postDate :: Date
	sender -> User
	
	function create(){
		this.save();
		sender := principal();
		postDate := today();
		log("Testimonial Creation Log: " + this);
		message ("Comment has been submitted successfully.");
	}

	function mayRemove() : Bool
	{
		return isAdministrator() || principal() == this.sender;
	}
	
	function remove()
	{
		this.sender := null;
		this.delete();
	}
}
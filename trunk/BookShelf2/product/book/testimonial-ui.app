module product/book/testimonial-ui

imports user/user-data
imports product/book/book-data
imports product/book/testimonial-data

access control rules
  rule page testimoniallist() {true}
  
section testimonial management

define page testimoniallist()
{
	var newTestimonial : String
	main()
	define body()
	{
		form
		{
			table
			{
				for (testimonial : Testimonial)
				{
					row
					{
						column
						{
							par{<strong> output(testimonial.sender.name+ " : " )</strong> output( testimonial.content )}
						}
						
						column
						{
							if (testimonial.mayRemove())
							{
								submitlink action
								{
									testimonial.remove();
									return testimoniallist();
								}{ output("Remove")} 
							}
						}
					}
					
				}
			}
			
			par
			{
				if (mayPostTestimonial())
				{
					par{ label("Post your testimonial "){ input(newTestimonial) } }
					submit postTestimonial(newTestimonial) {"Send" }
				}
			}
		}
	}
	
	action postTestimonial(input : String)
	{
		var testimonial := Testimonial {};
		testimonial.content := input;
		testimonial.create();
		return testimoniallist();
	}
}

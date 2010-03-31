module product/order/order-data

imports product/book/book-data

enum OrderStatus {statusInProgress("InProgress"), statusSubmitted("Submitted"), statusShipped("Shipped")}

entity OrderItem{
	count	::	Int
	book	->	Book
	order	->	Order
}

entity Order{
//    	code		:: String (id,validate(isUniqueOrder(this),"An order with that code already exists."))
	orderItems	-> Set<OrderItem> (inverse = OrderItem.order)
	date		:: Date
	status		-> OrderStatus
	customer	-> User (validate(isCustomer(), "The user should be a customer"))
	extend function Order(){
	  date := now();
	}
	function createOrder() {
		this.save();
	}
}


function deleteItem(item: OrderItem) {
    
}
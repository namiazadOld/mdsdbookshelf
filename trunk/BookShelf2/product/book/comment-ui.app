module product/book/comment-ui

imports user/user-data
imports product/book/book-data
imports product/book/comment-data

section comment management

define commentdetail(comment : Comment)
{
	par{<strong> output(comment.sender.name+ " : " )</strong> output( comment.content )}
}

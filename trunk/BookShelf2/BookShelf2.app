application exampleapp

description {
  A simple app that uses CRUD page generation for managing a Person entity
}

imports user/user-data
imports templates
imports user/user-data
imports user/user-ui
imports product/book/book-ui
imports product/book/genre-ui
imports product/book/author-ui

access control rules
 
  rule page root() { true }
 
section pages

define page root() {
  main()
  define body() {
    "Hello world!"
  }
}


package com.notas.core.model;

import com.notas.core.entity.Book;
import com.notas.core.entity.CodigoPostal;

public class ModeloBook {
	
	private int bookId;
   private String book_name;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public ModeloBook() {}
public ModeloBook(int bookId, String book_name) {
	super();
	this.bookId = bookId;
	this.book_name = book_name;
}
   
public ModeloBook(Book  book) {
	this.bookId = book.getBookId();
	this.book_name = book.getBookName();
}

   
}

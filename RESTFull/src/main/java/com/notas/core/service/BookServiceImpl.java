package com.notas.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notas.core.entity.Book;
import com.notas.core.model.ModeloBook;
import com.notas.core.model.ModeloCodigoPostal;
import com.notas.core.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
@Service("bookServiceImpl")
public class BookServiceImpl {
 
	@Autowired
	private BookRepository bookRepository;
 
	public Book saveBook(Book book) {
		book = bookRepository.save(book);
		return book;
 
	}
	
	public Book findByBookId(int bookId) {
		Book book = bookRepository.findByBookId(bookId);
		return book;
	}
	
	public ModeloBook obtenerPoLocalidad(int bookId) {
		
		return new ModeloBook(bookRepository.findByBookId(bookId));
		
	}
}
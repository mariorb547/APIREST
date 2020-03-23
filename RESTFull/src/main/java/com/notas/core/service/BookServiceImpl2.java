package com.notas.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.notas.core.entity.Book;
import com.notas.core.entity.Book2;
import com.notas.core.model.ModeloBook;
import com.notas.core.model.ModeloBook2;
import com.notas.core.model.ModeloCodigoPostal;
import com.notas.core.repository.BookRepository;
import com.notas.core.repository.BookRepository2;
import com.notas.core.repository.CodigoPostalRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
@Service("bookServiceImpl2")
public class BookServiceImpl2 {
 
	@Autowired
	@Qualifier("bookrepositorio2")
	private BookRepository2 bookRepository;
	
 
	
	public Book2 findByBookId(int bookId) {
		Book2 book2 = bookRepository.findById(bookId);
		return book2;
	}
	
	public ModeloBook2 obtenerPoLocalidad(int bookId) {
		
		return new ModeloBook2(bookRepository.findById(bookId));
		
	}
	
	
public Book2 obtenerZipCode(long zipCode) {
	Book2 book2 = bookRepository.findByZipCode(zipCode);
	return book2;
		
		
	}
	
	





	
}
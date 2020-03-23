package com.notas.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.notas.core.entity.Book;
import com.notas.core.model.ModeloBook;
import com.notas.core.model.ModeloCodigoPostal;
import com.notas.core.service.BookServiceImpl;
import com.notas.core.service.CodigoPostalService;


@RestController
@RequestMapping(value = "/book")
public class BookController {
	

	@Autowired
	@Qualifier("bookServiceImpl")
     BookServiceImpl bookService;
	
	
	@RequestMapping(value = "/savebook",method = RequestMethod.POST)
	@ResponseBody
    public Book saveBook(@RequestBody Book book) {
		Book bookResponse = bookService.saveBook(book);
		return bookResponse;
	}
	
	/*@RequestMapping(value = "/{bookId}",method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(@PathVariable int bookId) {
		Book bookResponse = bookService.findByBookId(bookId);
		
		return bookResponse;
	}*/
	
	
	@GetMapping("/localidad")
	public ModeloBook obtenerLocalidad(@RequestParam(name = "bookId") int bookId){
		
       //Book bookResponse = bookService.findByBookId(bookId);
		
		return new ModeloBook(bookService.findByBookId(bookId));
	}
	
	
}
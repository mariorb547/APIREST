package com.notas.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notas.core.entity.Book2;
import com.notas.core.service.BookServiceImpl2;


@RestController
@RequestMapping(value = "/book2")
public class BookController2 {
	

	@Autowired
	@Qualifier("bookServiceImpl2")
     BookServiceImpl2 bookService;
	
	
	
	
	@GetMapping("/localidad")
	public Book2 obtenerLocalidad(@RequestParam(name = "zipCode") long zipCode){
		
       Book2 bookResponse = bookService.obtenerZipCode(zipCode);
		
		return bookResponse;
	}
	
}
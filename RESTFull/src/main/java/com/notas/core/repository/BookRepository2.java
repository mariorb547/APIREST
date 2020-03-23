package com.notas.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notas.core.entity.Book;
import com.notas.core.entity.Book2;
import com.notas.core.entity.CodigoPostal;
 


@Repository("bookrepositorio2")
public interface BookRepository2 extends JpaRepository<Book2, Serializable>{
	
	public Book2 findById(int id);
	
	
	public Book2 findByZipCode(long zipCode);
		
}

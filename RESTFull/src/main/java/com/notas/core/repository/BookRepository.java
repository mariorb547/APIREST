package com.notas.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notas.core.entity.Book;
import com.notas.core.entity.CodigoPostal;
 


@Repository("bookrepositorio")
public interface BookRepository extends JpaRepository<Book, Serializable>{
	
	public Book findByBookId(int bookId);
		
}

package com.notas.core.entity;
import javax.persistence.*;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
 
	@Column(name = "book_name")
	private String bookName;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "storyiwd")
	private Story story;
 
	public Story getStory() {
		return story;
	}
 
	public void setStory(Story story) {
		this.story = story;
	}
 
	public int getBookId() {
		return bookId;
	}
 
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
 
	public String getBookName() {
		return bookName;
	}
 
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
 
}
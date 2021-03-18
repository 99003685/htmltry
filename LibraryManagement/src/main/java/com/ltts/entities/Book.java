package com.ltts.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="CONTACT")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String isbn;
	private String bookTitle;
	@Column(length=5000)
	private String bookDescription;
	private String author;
	private String publisher;
	private String edition;
	private String dateOfpublication;
	private String journal;
	
	@ManyToOne
	private User user;
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDateOfpublication() {
		return dateOfpublication;
	}
	public void setDateOfpublication(String dateOfpublication) {
		this.dateOfpublication = dateOfpublication;
	}
	public String getJournal() {
		return journal;
	}
	public void setJournal(String journal) {
		this.journal = journal;
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book(int bid, String isbn, String bookTitle, String bookDescription, String author, String publisher,
			String edition, String dateOfpublication, String journal) {
		super();
		this.bid = bid;
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.bookDescription = bookDescription;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.dateOfpublication = dateOfpublication;
		this.journal = journal;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", isbn=" + isbn + ", bookTitle=" + bookTitle + ", bookDescription="
				+ bookDescription + ", author=" + author + ", publisher=" + publisher + ", edition=" + edition
				+ ", dateOfpublication=" + dateOfpublication + ", journal=" + journal + "]";
	}
	
	

}

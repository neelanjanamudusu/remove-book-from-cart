package com.capgemini.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class RemoveBookEntity {
	@Id
	@GeneratedValue
	@Column(length=5)
	private int bookId;
	
	@Column(length=30)
	private String author;
	
	@Column(length=3)
	private int quantity;

	@Column(length=12)
	private String availability;
	
	@Column(length=6)
	private Double bookCost;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}


	public RemoveBookEntity(int bookId, String author, int quantity, String availability, Double bookCost) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.quantity = quantity;
		this.availability = availability;
		this.bookCost = bookCost;
	}

	public RemoveBookEntity() {
		
	}
	
}

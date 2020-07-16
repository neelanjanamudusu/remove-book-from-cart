package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.RemoveBookService;

@RestController
@RequestMapping("/Remove")
@CrossOrigin("http://localhost:4200")

public class Controller {
	@Autowired
	private RemoveBookService service;
	
	@DeleteMapping("/RemoveBook/{bookId}")
	public void removeBook(@PathVariable("bookId") int bookId) {
		service.removeBook(bookId);
		
	}
}

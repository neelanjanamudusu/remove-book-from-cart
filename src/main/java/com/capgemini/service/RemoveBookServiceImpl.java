package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.RemoveBookDao;

@Service
public class RemoveBookServiceImpl implements RemoveBookService{
@Autowired
private RemoveBookDao dao;
@Override
public void removeBook(int bookId) {
	 dao.deleteById(bookId);
	
}

}

package com.m24.demo.service;

import java.util.List;

import com.m24.demo.entity.Book;

public interface BookService {

	Book queryById(long id);

	List<Book> queryAll(int offset, int limit);
   
	void addBook(Book book);

}

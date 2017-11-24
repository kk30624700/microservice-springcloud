package com.m24.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.demo.entity.Book;
import com.m24.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping(value="queryById/{id}")
	public Book queryById(@PathVariable long id) {
		return service.queryById(id);
	}

	@RequestMapping("/queryAll/{offset}/{limit}")
	public List<Book> queryAll(@PathVariable int offset, @PathVariable int limit) {
		return service.queryAll(offset, limit);
	}

	@RequestMapping("/add")
	public void addBook(Book book) {
		service.addBook(book);
	}
}

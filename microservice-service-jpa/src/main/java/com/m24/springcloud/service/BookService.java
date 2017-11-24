package com.m24.springcloud.service;

import org.springframework.data.domain.Page;

import com.m24.springcloud.entity.Book;

public interface BookService {

	Book findByBookId(long id);

	Page<Book> findAll(int offset, int limit);
   
	Book save(Book book);

}

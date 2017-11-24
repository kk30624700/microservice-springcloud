package com.m24.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.m24.demo.dao.BookMapper;
import com.m24.demo.entity.Book;
import com.m24.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;
	
	@Override
	@Transactional(rollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRES_NEW)
	public Book queryById(long id) {
		addBook(new Book(3, "book3", 100));
//		throw new IllegalArgumentException();
		return mapper.queryById(id);
	}

	@Override
	@Transactional(noRollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRES_NEW)
	public List<Book> queryAll(int offset, int limit) {
		addBook(new Book(4, "book4", 100));
//		throw new IllegalArgumentException();
		return mapper.queryAll(offset, limit);
	}

	@Override
	@Transactional(noRollbackFor= {IllegalArgumentException.class}, isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)
	public void addBook(Book book) {
		mapper.insertBook(book);
	}

}

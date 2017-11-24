package com.m24.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.m24.demo.entity.Book;

public interface BookMapper {
   /**
    *
    * @param id
    * @return
    */
   Book queryById(long id);

   /**
    *
    * @param offset
    * @param limit
    * @return
    */
   List<Book> queryAll(@Param("offset") int offset,@Param("limit")int limit);

   /**
    *
    * @param bookId
    * @return
    */
   int reduceNumber(long bookId);
   
   /*

    */
   void insertBook(Book book);

}

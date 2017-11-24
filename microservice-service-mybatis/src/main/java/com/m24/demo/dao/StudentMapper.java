package com.m24.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.m24.demo.entity.Student;

public interface StudentMapper {
	/**
    *
    * @param id
    * @return
    */
   Student queryById(long id);

   /**
    *
    * @param offset
    * @param limit
    * @return
    */
   List<Student> queryAll(@Param("offset") int offset,@Param("limit")int limit);

   /*

    */
   void insertStudent(Student student);

}

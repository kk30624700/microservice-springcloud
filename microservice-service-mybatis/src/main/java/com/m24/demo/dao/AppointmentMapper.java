package com.m24.demo.dao;


import org.apache.ibatis.annotations.Param;

import com.m24.demo.entity.Appointment;

public interface AppointmentMapper {
    /**
    *
    * @param bookId
    * @param studentId
    * @return
    */
   int insertAppointment(@Param("bookId")long bookId,@Param("studentId")long studentId);

   /**
    * 
    * @param bookId
    * @return
    */
   Appointment queryWithStudentId(@Param("studentId")long studentId);
}

package com.m24.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m24.springcloud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
   Student findByStudentId(long studentId);
}

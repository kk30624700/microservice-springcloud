package com.m24.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m24.springcloud.entity.Student;
import com.m24.springcloud.repository.StudentRepository;
import com.m24.springcloud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository repository;
	
	@Override
	@Cacheable("student")
	@Transactional
	public Student findByStudentId(long id) {
		return repository.findByStudentId(id);
	}

	@Override
	@Transactional
	public List<Student> findAll(int offset, int limit) {
		return repository.findAll();
	}

	@Override
	@CachePut(value="student", key="#student.studentId")
	@Transactional
	public void save(Student student) {
		repository.save(student);
	}

}

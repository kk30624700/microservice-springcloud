package com.m24.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m24.demo.dao.StudentMapper;
import com.m24.demo.entity.Student;
import com.m24.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentMapper mapper;
	
	@Override
	@Transactional
	public Student queryById(long id) {
		return mapper.queryById(id);
	}

	@Override
	@Transactional
	public List<Student> queryAll(int offset, int limit) {
		return mapper.queryAll(offset, limit);
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		mapper.insertStudent(student);
	}

}

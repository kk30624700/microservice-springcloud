package com.m24.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m24.demo.dao.AppointmentMapper;
import com.m24.demo.entity.Appointment;
import com.m24.demo.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentMapper appointmentMapper;
	
	@Override
	@Transactional
	public int insertAppointment(long bookId, long studentId) {
		return appointmentMapper.insertAppointment(bookId, studentId);
	}

	@Override
	@Transactional
	public Appointment queryWithStudentId(long studnetId) {
		return appointmentMapper.queryWithStudentId(studnetId);
	}

}

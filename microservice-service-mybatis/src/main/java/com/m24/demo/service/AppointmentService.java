package com.m24.demo.service;

import com.m24.demo.entity.Appointment;

public interface AppointmentService {
	
	int insertAppointment(long bookId, long studentId);

	Appointment queryWithStudentId(long studnetId);
	
}

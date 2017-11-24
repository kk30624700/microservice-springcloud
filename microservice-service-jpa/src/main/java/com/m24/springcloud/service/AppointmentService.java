package com.m24.springcloud.service;

import com.m24.springcloud.entity.Appointment;

public interface AppointmentService {
	
	Appointment findByStudentId(long studnetId);

	Appointment save(Appointment appointment);
	
}

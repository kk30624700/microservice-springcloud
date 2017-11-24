package com.m24.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.springcloud.entity.Appointment;
import com.m24.springcloud.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService service;
	
	@RequestMapping("/save")
	public Appointment save(Appointment appointment) {
		return service.save(appointment);
	}

	@RequestMapping("/findByStudentId/{studentId}")
	public Appointment findByStudentId(@PathVariable long studentId) {
		return service.findByStudentId(studentId);
	}
}

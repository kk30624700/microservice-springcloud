package com.m24.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.demo.entity.Appointment;
import com.m24.demo.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService service;
	
	@RequestMapping("/insert/{bookId}/{studentId}")
	public int insertAppointment(@PathVariable long bookId, @PathVariable long studentId) {
		return service.insertAppointment(bookId, studentId);
	}

	@RequestMapping("/query/{studentId}")
	public Appointment queryWithStudentId(@PathVariable long studentId) {
		return service.queryWithStudentId(studentId);
	}
}

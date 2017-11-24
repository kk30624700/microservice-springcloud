package com.m24.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.m24.springcloud.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	@Query("from Appointment a where a.student.studentId=?1")
	Appointment findByStudentId(long studentId);
}

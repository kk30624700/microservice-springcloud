package com.m24.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Appointment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long appointmentId;// 图书ID

	private long bookId;// 图书ID
	
	private long studentId;// 学生ID

    private Timestamp appointTime;// 预约时间

    // 一对一的复合属性
    private Book book;// 图书实体
    
    private Student student;

    public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Timestamp appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String toString() {
        return "Appointment [bookId=" + bookId + "studentId=" + studentId + ", appointTime=" + appointTime + "]";
    }
}

package com.m24.demo.entity;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private long studentId;

    private String studentName;
    
	public long getStudentId() {
		return studentId;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
    }

}

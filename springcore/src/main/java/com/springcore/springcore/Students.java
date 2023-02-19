package com.springcore.springcore;

public class Students {

	private int studentId;
	private String studentName;
	private int studentAddress;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(int studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Students(int studentId, String studentName, int studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
}

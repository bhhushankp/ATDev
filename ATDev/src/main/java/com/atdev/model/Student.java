package com.atdev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
	private int rollNo;
	private String fname;
	private String lname;
	private String address;
	private String mobileNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", mobileNo=" + mobileNo + "]";
	}
	public Student(int rollNo, String fname, String lname, String address, String mobileNo) {
		super();
		this.rollNo = rollNo;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

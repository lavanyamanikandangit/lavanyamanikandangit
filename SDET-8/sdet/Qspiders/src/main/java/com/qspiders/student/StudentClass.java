package com.qspiders.student;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder (

	value= {"mobileNum","address","yop","address","yop"}

)

@JsonIgnoreProperties( value = { })
public class StudentClass {  							//POJO class

	String name;
	int rollNum;
	String yop;
	long mobileNum;
	String address;
	public StudentClass(String name, int rollNum, String yop, long mobileNum, String address) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.yop = yop;
		this.mobileNum = mobileNum;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	StudentClass(){ }
}

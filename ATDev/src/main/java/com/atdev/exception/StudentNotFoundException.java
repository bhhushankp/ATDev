package com.atdev.exception;

public class StudentNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String type;
	public String fieldName;
	public Integer fieldValue;
	public StudentNotFoundException(String type, String fieldName, Integer fieldValue) {
		super(String.format("%s not found %s :%s", type,fieldName,fieldValue));
		this.type = type;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}

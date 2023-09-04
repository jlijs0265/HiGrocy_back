package com.example.springreact.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class Employee implements Serializable{
	
	private int emp_no;
	private String empid;
	private String empname;
	private String emppass;
	private Date regdate;

	private Auth auth;
}

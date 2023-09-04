package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable{
	
	private int emp_no;
	private String empid;
	private String empname;
	private String emppass;
	private Date regdate;

	private AuthDTO auth;
}

package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
public class EmployeeRequestVO implements Serializable{
	
	private int emp_no;
	private String empid;
	private String empname;
	private String emppass;
	private Date regdate;

	private AuthRequestVO auth;
}

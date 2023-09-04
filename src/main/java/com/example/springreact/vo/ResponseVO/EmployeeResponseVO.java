package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
public class EmployeeResponseVO implements Serializable{
	
	private int emp_no;
	private String empid;
	private String empname;
	private String emppass;
	private Date regdate;

	private AuthResponseVO auth;
}

package com.example.springreact.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class orderRecord {
	
	private int order_code;
	private int account_code;
	private Date order_date;
	private String order_manager;
	private Date delivery_date;
	
}


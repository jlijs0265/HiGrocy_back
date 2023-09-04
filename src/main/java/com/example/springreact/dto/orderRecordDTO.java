package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class orderRecordDTO {
	
	private int order_code;
	private int account_code;
	private Date order_date;
	private String order_manager;
	private Date delivery_date;
	
}


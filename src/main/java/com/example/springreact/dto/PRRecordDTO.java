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
public class PRRecordDTO implements Serializable{
	
	int pr_record_code;
	Date request_date;
	String request_manager;
	
	
}

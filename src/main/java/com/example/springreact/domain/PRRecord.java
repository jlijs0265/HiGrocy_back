package com.example.springreact.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class PRRecord implements Serializable{
	
	int pr_record_code;
	Date request_date;
	String request_manager;
	
	
}

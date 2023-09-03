package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
public class PRRecordRequestVO implements Serializable{
	
	int pr_record_code;
	Date request_date;
	String request_manager;
	
	
}

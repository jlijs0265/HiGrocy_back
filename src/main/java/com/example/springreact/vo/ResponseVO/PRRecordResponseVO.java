package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
public class PRRecordResponseVO implements Serializable{
	
	int pr_record_code;
	Date request_date;
	String request_manager;
	
	
}

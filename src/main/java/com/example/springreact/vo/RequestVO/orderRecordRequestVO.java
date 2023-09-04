package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class orderRecordRequestVO {
	
	private int order_code;
	private int account_code;
	private Date order_date;
	private String order_manager;
	private Date delivery_date;
	
}


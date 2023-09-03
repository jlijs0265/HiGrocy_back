package com.example.springreact.domain;

import lombok.Data;

import java.sql.Date;

//생산요청 현황시 JOIN문으로 가져올 Domain
@Data
public class ProductionRequestList {
	int pr_code;
	Date request_date;
	String request_manager;
	int item_code;
	int amount;
}

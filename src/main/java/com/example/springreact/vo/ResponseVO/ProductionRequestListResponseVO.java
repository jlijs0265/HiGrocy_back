package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

//생산요청 현황시 JOIN문으로 가져올 Domain
@AllArgsConstructor
@Getter
public class ProductionRequestListResponseVO {
	int pr_code;
	Date request_date;
	String request_manager;
	int item_code;
	int amount;
}

package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

//생산요청 현황시 JOIN문으로 가져올 Domain
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductionRequestListDTO {
	int pr_code;
	Date request_date;
	String request_manager;
	int item_code;
	int amount;
}

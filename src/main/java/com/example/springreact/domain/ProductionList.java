package com.example.springreact.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class ProductionList {

	int pr_code;
	int item_code;
	Date sdate;
}

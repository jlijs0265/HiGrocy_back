package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class ProductionListResponseVO {

	int pr_code;
	int item_code;
	Date sdate;
}

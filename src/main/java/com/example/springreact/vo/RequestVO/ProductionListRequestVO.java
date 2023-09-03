package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class ProductionListRequestVO {

	int pr_code;
	int item_code;
	Date sdate;
}

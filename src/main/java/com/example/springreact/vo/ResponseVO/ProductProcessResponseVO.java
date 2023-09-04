package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductProcessResponseVO {
	int product_process_code;
	int product_code;
	int process_time;
	int process_order;
	int machine_code;
}

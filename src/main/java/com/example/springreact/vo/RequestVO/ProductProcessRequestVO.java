package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductProcessRequestVO {
	int product_process_code;
	int product_code;
	int process_time;
	int process_order;
	int machine_code;
}

package com.example.springreact.domain;

import lombok.Data;

@Data
public class ProductProcess {
	int product_process_code;
	int product_code;
	int process_time;
	int process_order;
	int machine_code;
}

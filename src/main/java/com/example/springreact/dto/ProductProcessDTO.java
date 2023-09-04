package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductProcessDTO {
	int product_process_code;
	int product_code;
	int process_time;
	int process_order;
	int machine_code;
}

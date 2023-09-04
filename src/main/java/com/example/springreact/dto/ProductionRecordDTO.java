package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductionRecordDTO {
	int production_record_code;
	int machine_code;
	int item_code;
	int pr_code;
	int usage_time;
	int defective_amount;
}

package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductionRecordRequestVO {
	int production_record_code;
	int machine_code;
	int item_code;
	int pr_code;
	int usage_time;
	int defective_amount;
}

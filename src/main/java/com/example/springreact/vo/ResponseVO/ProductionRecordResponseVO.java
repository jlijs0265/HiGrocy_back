package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductionRecordResponseVO {
	int production_record_code;
	int machine_code;
	int item_code;
	int pr_code;
	int usage_time;
	int defective_amount;
}

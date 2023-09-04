package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RawMaterialRequestVO {
	int raw_materials_code;
	String type;
	String name;
	String renewability;
	String unit;
	int standard_quantity;
	String origin;
	
	// item_code
	private int item_code;

	
}

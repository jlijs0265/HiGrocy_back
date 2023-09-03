package com.example.springreact.domain;

import lombok.Data;

@Data
public class RawMaterial {
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

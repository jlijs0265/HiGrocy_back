package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialDTO {
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

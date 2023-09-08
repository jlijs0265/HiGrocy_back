package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialRequestVO {

	int raw_materials_code;
	String raw_type;
	String name;
	String renewability;
	String unit;
	int standard_quantity;
	String volume;
	String origin;


	
}

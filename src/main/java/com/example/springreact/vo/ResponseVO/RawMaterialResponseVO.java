package com.example.springreact.vo.ResponseVO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RawMaterialResponseVO {

	int raw_materials_code;
	String raw_type;
	String name;
	String renewability;
	String unit;
	int standard_quantity;
	String volume;
	String origin;

	
}

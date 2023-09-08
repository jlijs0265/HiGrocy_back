package com.example.springreact.dto;

import com.example.springreact.domain.Item;
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
	String raw_type;
	String renewability;
	String unit;
	int standard_quantity;
	String origin;
	// item_code
	private Item item;

	
}

package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BomRequestVO {
	
	 private int product_code;
	 private int raw_materials_code;
	 private int amount;

}

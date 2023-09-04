package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class orderListRequestVO {
	private int order_code;
	private int item_code;
	private int account_code;
	private int price;
	private int amount;
	private RawMaterialRequestVO item;
}
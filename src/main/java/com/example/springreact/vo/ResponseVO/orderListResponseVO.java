package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class orderListResponseVO {
	private int order_code;
	private int item_code;
	private int account_code;
	private int price;
	private int amount;
	private RawMaterialResponseVO item;
}
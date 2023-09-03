package com.example.springreact.domain;

import lombok.Data;

@Data
public class orderList {
	private int order_code;
	private int item_code;
	private int account_code;
	private int price;
	private int amount;
	private RawMaterial item;
}
package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class orderListDTO {
	private int order_code;
	private int item_code;
	private int account_code;
	private int price;
	private int amount;
	private RawMaterialDTO item;
}
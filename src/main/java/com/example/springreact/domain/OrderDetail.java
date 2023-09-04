package com.example.springreact.domain;

import lombok.Data;

@Data
public class OrderDetail {
    private String order_code;
    private int item_code;
    private int account_code;
    private int price;
    private int amount;
}

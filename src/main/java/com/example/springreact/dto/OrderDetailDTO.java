package com.example.springreact.dto;

import com.example.springreact.domain.RawMaterials;
import lombok.Data;

@Data
public class OrderDetailDTO {
    private String order_code;
    private int item_code;
    private int account_code;
    private int price;
    private int amount;
    private RawMaterials item;
}

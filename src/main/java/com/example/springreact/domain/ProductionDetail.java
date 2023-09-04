package com.example.springreact.domain;

import lombok.Data;

@Data
public class ProductionDetail {
    private int machine_code;
    private int item_code;
    private String production_code;
    private int production_recode_code;
    private int usage_time;
    private int defective_amount;

}

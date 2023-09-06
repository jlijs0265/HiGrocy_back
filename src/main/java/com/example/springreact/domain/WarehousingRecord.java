package com.example.springreact.domain;

import lombok.Data;

import java.util.Date;

@Data
public class WarehousingRecord {

    private String warehousing_code;
    private int item_code;
    private int storage_code;
    private int amount;
    private Date wr_date;
    private String warehousing_type;
}

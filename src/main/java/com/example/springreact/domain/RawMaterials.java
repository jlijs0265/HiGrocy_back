package com.example.springreact.domain;


import lombok.Data;

@Data
public class RawMaterials {
    private int raw_materials_code;
    private int item_code;
    private String raw_type;
    private String renewability;
    private String unit;
    private int standard_quantity;
    private String origin;
}

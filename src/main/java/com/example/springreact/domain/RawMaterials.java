package com.example.springreact.domain;


import lombok.Data;

@Data
public class RawMaterials {
    private int raw_materials_code;
    private int item_code;
    private String type;
    private String renewability;
    private String nuit;
    private int standard_quantity;
    private String origin;
}

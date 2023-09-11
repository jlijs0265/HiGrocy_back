package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PMDetailDTO {
	int pm_detail_code;
	int machine_code;
	String name;
	String factory_name;
	String location;
}

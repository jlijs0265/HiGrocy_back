package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PMListDTO {
	int pm_list_code;
	int machine_code;
	String name;
	String factory_name;
	String location;
}

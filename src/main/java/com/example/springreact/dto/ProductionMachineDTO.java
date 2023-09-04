package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductionMachineDTO {
	int machine_code;
	String type;
	int gas_emissions;
	int energy_usage;
	
}

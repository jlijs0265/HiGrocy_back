package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductionMachineResponseVO {
	int machine_code;
	String type;
	int gas_emissions;
	int energy_usage;
	
}

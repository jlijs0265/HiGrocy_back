package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ProductionMachineRequestVO {
	int machine_code;
	String type;
	int gas_emissions;
	int energy_usage;
	
}

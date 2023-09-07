package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ProductionMachineResponseVO<T> {
	int machine_code;
	List<T> list;

	public ProductionMachineResponseVO(int machine_code) {
		this.machine_code = machine_code;
	}

	public ProductionMachineResponseVO(List<T> list) {
		this.list = list;
	}
}

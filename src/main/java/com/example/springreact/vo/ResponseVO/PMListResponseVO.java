package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PMListResponseVO {
	int pm_list_code;
	int machine_code;
	String name;
	String factory_name;
	String location;
}

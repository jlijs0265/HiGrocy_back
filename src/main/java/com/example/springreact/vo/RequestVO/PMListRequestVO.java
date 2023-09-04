package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PMListRequestVO {
	int pm_list_code;
	int machine_code;
	String name;
	String factory_name;
	String location;
}

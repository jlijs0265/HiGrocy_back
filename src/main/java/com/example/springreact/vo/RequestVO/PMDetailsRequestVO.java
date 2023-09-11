package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class PMDetailsRequestVO {
	int pm_detail_code;
	int machine_code;
	String name;
	String factory_name;
	String location;
}

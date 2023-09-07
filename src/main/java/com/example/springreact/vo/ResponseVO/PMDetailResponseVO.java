package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class PMDetailResponseVO<T> {
	int pm_detail_code;
	List<T> list;

	public PMDetailResponseVO(int pm_list_code) {
		this.pm_detail_code = pm_list_code;
	}

	public PMDetailResponseVO(List<T> list) {
		this.list = list;
	}
}

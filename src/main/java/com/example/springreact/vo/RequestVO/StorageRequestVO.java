package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StorageRequestVO {
	private int storage_code;
	private String name;
	private String location;
	private String manager;
	private String max_loadage;

}

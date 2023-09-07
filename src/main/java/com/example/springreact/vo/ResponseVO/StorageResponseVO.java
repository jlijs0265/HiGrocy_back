package com.example.springreact.vo.ResponseVO;

import com.example.springreact.dto.StorageDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StorageResponseVO {
	private int storage_code;
	private String name;
	private String location;
	private String manager;
	private String max_loadage;

	public StorageResponseVO(int storage_code) {
		this.storage_code = storage_code;
	}

	public StorageResponseVO(StorageDTO item) {
		this.storage_code = item.getStorage_code();
		this.name = getName();
		this.location = getLocation();
		this.manager = getManager();
		this.max_loadage = getMax_loadage();
	}
}

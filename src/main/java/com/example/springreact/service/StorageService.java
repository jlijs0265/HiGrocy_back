package com.example.springreact.service;

import com.example.springreact.domain.Storage;
import com.example.springreact.dto.StorageDTO;


import java.util.List;

public interface StorageService {
	int register(StorageDTO storageDTO);
	int update(StorageDTO storageDTO);
	int delete(int code);
	StorageDTO get(int code);
	List<StorageDTO> getList();
}

package com.example.springreact.service;

import com.example.springreact.domain.Storage;
import com.example.springreact.dto.StorageDTO;
import com.example.springreact.mapper.StorageMapper;
import com.example.springreact.vo.ResponseVO.StorageResponseVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
//@Log4j
public class StorageServiceImpl implements StorageService {

	StorageMapper mapper;

	@Override
	public int register(StorageDTO storageDTO) {

		ModelMapper modelMapper = new ModelMapper();
		Storage storage = modelMapper.map(storageDTO,Storage.class);
		mapper.register(storage);
		System.out.println("StorageServiceImpl : " + storage);

		return 0;
	}

	@Override
	public int update(StorageDTO storageDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Storage storage = modelMapper.map(storageDTO,Storage.class);
		System.out.println("StorageServiceImpl : " + storage);
		mapper.update(storage);
		return 0;
	}

	@Override
	public int delete(int code) {
		return 0;
	}

	@Override
	public StorageDTO get(int code) {
		return null;
	}

	@Override
	public List<StorageDTO> getList() {
		ModelMapper modelMapper = new ModelMapper();
		List<StorageDTO> storageList = mapper.getList()
				.stream()
				.map(item -> modelMapper.map(item, StorageDTO.class))
				.collect(Collectors.toList());
		System.out.println("++++++++++++++StorageServiceImpl++++++++++++++++++");
		System.out.println("StorageResponseVO : "+storageList);


		return storageList;
	}
}

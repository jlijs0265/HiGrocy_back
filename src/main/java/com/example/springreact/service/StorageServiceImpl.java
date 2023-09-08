package com.example.springreact.service;

import com.example.springreact.domain.Storage;
import com.example.springreact.dto.Criteria;
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

@Service
@AllArgsConstructor
//@Log4j
public class StorageServiceImpl implements StorageService {

	@Autowired
	StorageMapper mapper;

	@Override
	public int register(StorageDTO storageDTO) {

		ModelMapper modelMapper = new ModelMapper();
		Storage storage = modelMapper.map(storageDTO,Storage.class);

		System.out.println("StorageServiceImpl : " + storage);
		mapper.register(storage);
		StorageDTO storageDto = modelMapper.map(storage,StorageDTO.class);

		return storageDto.getStorage_code();
	}

	@Override
	public int update(StorageDTO storageDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Storage storage = modelMapper.map(storageDTO,Storage.class);
		System.out.println("StorageServiceImpl : " + storage);
		return mapper.update(storage);
	}

	@Override
	public int delete(int code) {
		return mapper.delete(code);
	}

	@Override
	public StorageDTO get(int code) {
		return null;
	}

	@Override
	public List<StorageDTO> getList(Criteria criteria) {
		ModelMapper modelMapper = new ModelMapper();
		List<StorageDTO> storageList = mapper.getList(criteria)
				.stream()
				.map(item -> modelMapper.map(item, StorageDTO.class))
				.collect(Collectors.toList());
		System.out.println("++++++++++++++StorageServiceImpl++++++++++++++++++");
		System.out.println("StorageResponseVO : "+storageList);


		return storageList;
	}

	@Override
	public int getTotal() {
		return mapper.getTotal();
	}
}

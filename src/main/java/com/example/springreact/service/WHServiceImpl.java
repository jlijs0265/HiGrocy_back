package com.example.springreact.service;

import com.example.springreact.domain.WHList;
import com.example.springreact.dto.WHListDTO;
import com.example.springreact.mapper.WHManageMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
//@Log4j
public class WHServiceImpl implements WHService {


	@Override
	public int register(WHList whList) {
		return 0;
	}

	@Override
	public int update(WHList whList) {
		return 0;
	}

	@Override
	public int delete(int code) {
		return 0;
	}

	@Override
	public WHListDTO get(int code) {
		return null;
	}

	@Override
	public List<WHListDTO> getList() {
		return null;
	}

	@Override
	public List<WHListDTO> getDetailList() {
		return null;
	}
}

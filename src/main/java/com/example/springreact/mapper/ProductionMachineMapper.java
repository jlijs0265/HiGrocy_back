package com.example.springreact.mapper;

import com.example.springreact.domain.ProductionMachine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductionMachineMapper {
	
	//등록
	int save(ProductionMachine productionMachine);
	//수정
	int update(ProductionMachine productionMachine);
	//삭제
	int deleteByMachine_code(String code);
	//단일 조회
	ProductionMachine findByMachine_code(int code);
	//전체 조회
	List<ProductionMachine> findAll();

}

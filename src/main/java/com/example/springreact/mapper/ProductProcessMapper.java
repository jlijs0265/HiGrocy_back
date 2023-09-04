package com.example.springreact.mapper;

import com.example.springreact.domain.ProductProcess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductProcessMapper {
	
	//등록
	int save(ProductProcess productProcess);

	//삭제
	int deleteByProduct_process_code(String code);
	//목록 조회
	List<ProductProcess> findByProduct_code(int code);


}

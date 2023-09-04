package com.example.springreact.mapper;

import com.example.springreact.domain.PMDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PMDetailMapper {
	
	//등록
	int save(PMDetails pMDetails);
	//수정
	int update(PMDetails pMDetails);
	//삭제
	int deleteByPm_detail_code(String code);
	//단일 조회
	PMDetails findByPm_detail_code(int code);
	//전체 조회
	List<PMDetails> findAll();

}

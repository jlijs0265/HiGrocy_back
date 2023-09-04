package com.example.springreact.mapper;

import com.example.springreact.domain.Storage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StorageMapper {
	
	//등록
	public int register(Storage storage);
	//수정
	public int update(Storage storage);
	//삭제
	public int delete(int code);
	//단일 조회
	public Storage get(int code);
	//전체 조회
	public List<Storage> getList();

}

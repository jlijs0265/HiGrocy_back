package com.example.springreact.mapper;

import com.example.springreact.domain.WarehousingRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehousingRecordMapper {

    //wh_code 분류 전체 조회
    public List<WarehousingRecord> selectGetList(String wh_code);
}

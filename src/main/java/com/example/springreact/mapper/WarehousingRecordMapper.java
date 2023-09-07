package com.example.springreact.mapper;

import com.example.springreact.domain.WarehousingRecord;
import com.example.springreact.dto.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehousingRecordMapper {

    //wh_code 분류 전체 조회
    public List<WarehousingRecord> selectGetList(String wh_code);

    public List<WarehousingRecord> getList(Criteria criteria);

    public List<WarehousingRecord> getGRList();

    public List<WarehousingRecord> getGIList();

    public List<WarehousingRecord> getCurrentList(Criteria criteria);

    public int register(WarehousingRecord warehousingRecord);

    public int delete(String code);

    public int update(WarehousingRecord warehousingRecord);

    int getTotal();
}

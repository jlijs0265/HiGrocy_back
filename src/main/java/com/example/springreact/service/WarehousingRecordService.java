package com.example.springreact.service;

import com.example.springreact.domain.WarehousingRecord;
import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.WarehousingRecordDTO;


import java.util.List;

public interface WarehousingRecordService {
    public List<WarehousingRecordDTO> getListByCode(String wh_code);

    public List<WarehousingRecordDTO> getList(Criteria criteria);

    public List<WarehousingRecordDTO> getGRList();

    public List<WarehousingRecordDTO> getGIList();

    public List<WarehousingRecordDTO> getCurrentList();

    public int register(WarehousingRecordDTO whDto);

    public int delete(String code);

    public int update(WarehousingRecordDTO warehousingRecordDTO);

    int getTotal();
}

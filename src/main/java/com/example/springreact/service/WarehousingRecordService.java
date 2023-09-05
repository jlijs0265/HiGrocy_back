package com.example.springreact.service;

import com.example.springreact.dto.WarehousingRecordDTO;


import java.util.List;

public interface WarehousingRecordService {
    public List<WarehousingRecordDTO> getListByCode(String wh_code);

}

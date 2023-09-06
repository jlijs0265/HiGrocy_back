package com.example.springreact.service;

import com.example.springreact.domain.WarehousingRecord;
import com.example.springreact.dto.WarehousingRecordDTO;
import com.example.springreact.mapper.WarehousingRecordMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
//@Log4j
public class WarehousingRecordServiceImpl implements WarehousingRecordService {

    @Autowired
    WarehousingRecordMapper wh_mapper;

    /*RawMaterial 쪽 mapper 구현되면 Item객체도 받아와서 DTO에 넣어 줄 예정*/
    @Override
    public List<WarehousingRecordDTO> getListByCode(String wh_code) {
        // 확인용 메서드
        System.out.println("getListByCode 실행됨");
        System.out.println("WH_CODE : " + wh_code);
        System.out.println("getListByCode : " + wh_mapper.selectGetList(wh_code));
        return null;

    }

}

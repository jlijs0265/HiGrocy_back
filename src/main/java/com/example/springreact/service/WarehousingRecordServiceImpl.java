package com.example.springreact.service;

import com.example.springreact.domain.Storage;
import com.example.springreact.domain.WarehousingRecord;
import com.example.springreact.dto.StorageDTO;
import com.example.springreact.dto.WarehousingRecordDTO;
import com.example.springreact.mapper.WarehousingRecordMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
//@Log4j
public class WarehousingRecordServiceImpl implements WarehousingRecordService {

    @Autowired
    WarehousingRecordMapper wh_mapper;

    /*RawMaterial 쪽 mapper 구현되면 Item객체도 받아와서 DTO에 넣어 줄 예정*/
    @Override
    public List<WarehousingRecordDTO> getListByCode(String wh_code) {
        ModelMapper modelMapper = new ModelMapper();
        List<WarehousingRecordDTO> CodeByList = wh_mapper.selectGetList(wh_code)
                .stream()
                .map(item -> modelMapper.map(item, WarehousingRecordDTO.class))
                .collect(Collectors.toList());
        return CodeByList;

    }

    @Override
    public List<WarehousingRecordDTO> getList() {
        System.out.println(wh_mapper.getList());
        List<WarehousingRecordDTO> GRList = new ArrayList<>(); //입고 재고
        List<WarehousingRecordDTO> GIList = new ArrayList<>(); //출고 재고
        List<WarehousingRecordDTO> CurrentList = new ArrayList<>(); // 현 재고

        //Domain => DTO
        ModelMapper modelMapper = new ModelMapper();
        List<WarehousingRecordDTO> whListDto = wh_mapper.getList()
                .stream()
                .map(item -> modelMapper.map(item, WarehousingRecordDTO.class))
                .collect(Collectors.toList());

        System.out.println(whListDto);
        //입고 출고 분리
        for(int i = 0; i < whListDto.size(); i++){
            if(whListDto.get(i).getWarehousing_type().equals("입고")){
                GRList.add(whListDto.get(i));
            }
            else if(whListDto.get(i).getWarehousing_type().equals("출고")){
                GIList.add(whListDto.get(i));
            }
        }

        // CurrentList 초기화 및 계산
        CurrentList = new ArrayList<>(whListDto);
        for (int j = 0; j < CurrentList.size(); j++) {
            for (WarehousingRecordDTO giItem : GIList) {
                if (CurrentList.get(j).getItem().getItem_code() == giItem.getItem_code()) {
                    CurrentList.get(j).setAmount(CurrentList.get(j).getAmount() - giItem.getAmount());
                }
            }
        }

        System.out.println("GRList : "+GRList);
        System.out.println("GIList : "+GIList);
        System.out.println("CurrentList : " + CurrentList);

        return whListDto;
    }

    @Override
    public List<WarehousingRecordDTO> getGRList() {

        //Domain => DTO
        ModelMapper modelMapper = new ModelMapper();
        List<WarehousingRecordDTO> GRListDto = wh_mapper.getGRList()
                .stream()
                .map(item -> modelMapper.map(item, WarehousingRecordDTO.class))
                .collect(Collectors.toList());
        System.out.println(GRListDto);
        return GRListDto;
    }

    @Override
    public List<WarehousingRecordDTO> getGIList() {
        ModelMapper modelMapper = new ModelMapper();
        List<WarehousingRecordDTO> GIListDto = wh_mapper.getGIList()
                .stream()
                .map(item -> modelMapper.map(item, WarehousingRecordDTO.class))
                .collect(Collectors.toList());

        return GIListDto;
    }

    @Override
    public List<WarehousingRecordDTO> getCurrentList() {

        //Domain => DTO
        ModelMapper modelMapper = new ModelMapper();
        List<WarehousingRecordDTO> CurrentListDto = wh_mapper.getCurrentList()
                .stream()
                .map(item -> modelMapper.map(item, WarehousingRecordDTO.class))
                .collect(Collectors.toList());
        System.out.println(CurrentListDto);

        return CurrentListDto;
    }

    @Override
    public int register(WarehousingRecordDTO whDto) {
        ModelMapper modelMapper = new ModelMapper();
        WarehousingRecord warehousingRecord = modelMapper.map(whDto,WarehousingRecord.class);
        System.out.println("whServiceImpl : " + warehousingRecord);
        return wh_mapper.register(warehousingRecord);
    }

    @Override
    public int delete(String code) {
        System.out.println(code);
        return wh_mapper.delete(code);
    }

    @Override
    public int update(WarehousingRecordDTO whDto) {
        ModelMapper mapper = new ModelMapper();
        WarehousingRecord warehousingRecord = mapper.map(whDto,WarehousingRecord.class);
        return wh_mapper.update(warehousingRecord);
    }
}

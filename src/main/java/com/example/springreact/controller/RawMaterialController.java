package com.example.springreact.controller;

import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.service.RawMaterialService;
import com.example.springreact.vo.RequestVO.RawMaterialRequestVO;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class RawMaterialController {

    @Autowired
    private RawMaterialService service;

    @PostMapping("/raw_material")
    public ResponseEntity<String> registerRawMaterial(@RequestBody RawMaterialRequestVO rawMaterialRequestVO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RawMaterialDTO rawDto = mapper.map(rawMaterialRequestVO, RawMaterialDTO.class);
        ItemDTO itemDto = mapper.map(rawMaterialRequestVO, ItemDTO.class);
        itemDto.setType("원부자재");
        log.info(rawDto.toString());
        int result = service.registerItem(rawDto, itemDto);

        return result == 1 ? ResponseEntity.status(HttpStatus.OK).body("okok~") : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("에러 발생");
    }

    @GetMapping("/raw_material")
    public void getRawMaterialList() {
        service.getRawMaterialList();
    }

}

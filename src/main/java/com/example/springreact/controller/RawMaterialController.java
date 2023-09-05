package com.example.springreact.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Log
public class RawMaterialController {

//    @Autowired
//    private RawMaterialService service;

    @PostMapping("/raw_material")
    public ResponseEntity<String> registerRawMaterial(@RequestBody RawMaterialRequestVO rawMaterialRequestVO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RawMaterialDTO rawDto = mapper.map(rawMaterialRequestVO, RawMaterialDTO.class);
        log.info(rawDto.toString());
        return ResponseEntity.status(HttpStatus.OK).body("성공쓰~");
    }

}

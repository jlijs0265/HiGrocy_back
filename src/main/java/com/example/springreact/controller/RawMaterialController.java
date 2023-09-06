package com.example.springreact.controller;

import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.dto.PageDto;
import com.example.springreact.service.RawMaterialService;
import com.example.springreact.vo.RequestVO.RawMaterialRequestVO;
import com.example.springreact.vo.ResponseVO.RawMaterialResponseVO;
import com.example.springreact.vo.ResponseVO.RawResponseVO;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log
public class RawMaterialController {

    @Autowired
    private RawMaterialService service;

    @PostMapping("/raw_material")
    public ResponseEntity<Map<String, Object>> registerRawMaterial(@RequestBody RawMaterialRequestVO rawMaterialRequestVO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RawMaterialDTO rawDto = mapper.map(rawMaterialRequestVO, RawMaterialDTO.class);
        ItemDTO itemDto = mapper.map(rawMaterialRequestVO, ItemDTO.class);
        itemDto.setVolume(rawMaterialRequestVO.getUnit());
        itemDto.setType("원부자재");

        int result = service.registerItem(rawDto, itemDto);
        Map<String, Object> response = new HashMap<>();
        response.put("raw_materials_code" , result);
        return result != 0 ? ResponseEntity.status(HttpStatus.OK).body(response) : new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = {"/raw_material"})
    public ResponseEntity<RawResponseVO> getRawMaterialList(@RequestParam("page") String page) {
        Criteria criteria = new Criteria();
        if(page != null) {
            criteria.setPageNum(Integer.parseInt(page));
        }
        List<RawMaterialResponseVO> rawMaterialResponseVOList = service.getRawMaterialList(criteria);
        PageDto pageDto = new PageDto(5, service.getTotalRaw(), criteria);
        RawResponseVO response = new RawResponseVO(rawMaterialResponseVOList, pageDto);
        return rawMaterialResponseVOList != null ? ResponseEntity.status(HttpStatus.OK).body(response) : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

//    @GetMapping("/raw_material/{raw_materials_code}")
//    public ResponseEntity<RawMaterialResponseVO> getRawMaterial(@PathVariable int raw_materials_code) {
//        RawMaterialResponseVO rawMaterialResponseVO = service.getRawMaterial(raw_materials_code);
//        return rawMaterialResponseVO != null ? ResponseEntity.status(HttpStatus.OK).body(rawMaterialResponseVO) : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }

    
    // 수정
    @PutMapping("/raw_material")
    public ResponseEntity<String> updateRawMaterial(@RequestBody RawMaterialRequestVO rawMaterialRequestVO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RawMaterialDTO rawDto = mapper.map(rawMaterialRequestVO, RawMaterialDTO.class);
        ItemDTO itemDto = mapper.map(rawMaterialRequestVO, ItemDTO.class);
        itemDto.setItem_code(rawMaterialRequestVO.getRaw_materials_code());
        service.updateRawMaterial(rawDto, itemDto);
        return null;
    }

    // 삭제
    @DeleteMapping("/raw_material/{raw_materials_code}")
    public void deleteRawMaterial(@PathVariable int raw_materials_code) {
        service.deleteRawMaterial(raw_materials_code);
    }

}

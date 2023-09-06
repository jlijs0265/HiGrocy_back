package com.example.springreact.controller;

import com.example.springreact.dto.*;
import com.example.springreact.service.PMService;
import com.example.springreact.service.RawMaterialService;
import com.example.springreact.vo.RequestVO.ProductionMachineRequestVO;
import com.example.springreact.vo.RequestVO.RawMaterialRequestVO;
import com.example.springreact.vo.ResponseVO.ProductionMachineResponseVO;
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
public class PMController {

    private PMService pmService;

    public PMController(PMService pmService) {
        this.pmService = pmService;
    }

    @PostMapping("/pm")
    public ResponseEntity<Object> registerPM(@RequestBody ProductionMachineRequestVO productionMachineRequestVO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachineDTO productionMachineDTO = mapper.map(productionMachineRequestVO, ProductionMachineDTO.class);
        productionMachineDTO = pmService.save(productionMachineDTO);
        return ResponseEntity.ok().body(new ProductionMachineResponseVO(productionMachineDTO.getMachine_code()));

    }
}
//
//    @GetMapping(value = {"/pm"})
//    public ResponseEntity<RawResponseVO> getRawMaterialList(@RequestParam("page") String page) {
//        Criteria criteria = new Criteria();
//        if(page != null) {
//            criteria.setPageNum(Integer.parseInt(page));
//        }
//        List<RawMaterialResponseVO> rawMaterialResponseVOList = service.getRawMaterialList(criteria);
//        PageDto pageDto = new PageDto(5, service.getTotalRaw(), criteria);
//        RawResponseVO response = new RawResponseVO(rawMaterialResponseVOList, pageDto);
//        return rawMaterialResponseVOList != null ? ResponseEntity.status(HttpStatus.OK).body(response) : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//    }
//
////    @GetMapping("/pm/{pms_code}")
////    public ResponseEntity<RawMaterialResponseVO> getRawMaterial(@PathVariable int pms_code) {
////        RawMaterialResponseVO rawMaterialResponseVO = service.getRawMaterial(pms_code);
////        return rawMaterialResponseVO != null ? ResponseEntity.status(HttpStatus.OK).body(rawMaterialResponseVO) : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
////    }
//
//
//    // 수정
//    @PutMapping("/pm")
//    public ResponseEntity<String> updateRawMaterial(@RequestBody RawMaterialRequestVO rawMaterialRequestVO) {
//        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//        RawMaterialDTO rawDto = mapper.map(rawMaterialRequestVO, RawMaterialDTO.class);
//        ItemDTO itemDto = mapper.map(rawMaterialRequestVO, ItemDTO.class);
//        itemDto.setItem_code(rawMaterialRequestVO.getRaw_materials_code());
//        service.updateRawMaterial(rawDto, itemDto);
//        return null;
//    }
//
//    // 삭제
//    @DeleteMapping("/pm/{pms_code}")
//    public void deleteRawMaterial(@PathVariable int pms_code) {
//        service.deleteRawMaterial(pms_code);
//    }
//
//}

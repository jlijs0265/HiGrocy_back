package com.example.springreact.controller;

import com.example.springreact.domain.ProductionMachine;
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


    @GetMapping(value = {"/pm"})
    public ResponseEntity<Object> getListPM() {
        List<ProductionMachineDTO> list = pmService.findAll();
        return ResponseEntity.ok().body(new ProductionMachineResponseVO(list));
    }
    @PutMapping("/pm")
    public ResponseEntity<Object> updatePM(@RequestBody ProductionMachineRequestVO productionMachineRequestVO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachineDTO productionMachineDTO = mapper.map(productionMachineRequestVO, ProductionMachineDTO.class);
        productionMachineDTO = pmService.update(productionMachineDTO);
        return ResponseEntity.ok().body("성공");
    }

    @DeleteMapping("/pm/{machine_code}")
    public ResponseEntity<Object> deletePM(@PathVariable int machine_code) {
        pmService.delete(machine_code);
        return ResponseEntity.ok().body("성공");
    }
}

//
//    // 삭제
//    @DeleteMapping("/pm/{pms_code}")
//    public void deleteRawMaterial(@PathVariable int pms_code) {
//        service.deleteRawMaterial(pms_code);
//    }
//
//}

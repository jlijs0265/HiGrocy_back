package com.example.springreact.controller;

import com.example.springreact.dto.*;
import com.example.springreact.service.PMService;
import com.example.springreact.vo.RequestVO.PMDetailsRequestVO;
import com.example.springreact.vo.RequestVO.ProductionMachineRequestVO;
import com.example.springreact.vo.ResponseVO.PMDetailResponseVO;
import com.example.springreact.vo.ResponseVO.ProductionMachineResponseVO;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        productionMachineDTO = pmService.PMsave(productionMachineDTO);
        return ResponseEntity.ok().body(new ProductionMachineResponseVO(productionMachineDTO.getMachine_code()));

    }


    @GetMapping(value = {"/pm"})
    public ResponseEntity<Object> getListPM() {
        List<ProductionMachineDTO> list = pmService.PMfindAll();
        return ResponseEntity.ok().body(new ProductionMachineResponseVO(list));
    }
    @PutMapping("/pm")
    public ResponseEntity<Object> updatePM(@RequestBody ProductionMachineRequestVO productionMachineRequestVO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachineDTO productionMachineDTO = mapper.map(productionMachineRequestVO, ProductionMachineDTO.class);
        productionMachineDTO = pmService.PMupdate(productionMachineDTO);
        return ResponseEntity.ok().body("성공");
    }

    @DeleteMapping("/pm/{machine_code}")
    public ResponseEntity<Object> deletePM(@PathVariable int machine_code) {
        pmService.PMdelete(machine_code);
        return ResponseEntity.ok().body("성공");
    }

    @PostMapping("/pmDetail")
    public ResponseEntity<Object> registerPMD(@RequestBody PMDetailsRequestVO pmDetailsRequestVO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        PMDetailDTO pmDetailDTO = mapper.map(pmDetailsRequestVO, PMDetailDTO.class);
        pmDetailDTO = pmService.PMDsave(pmDetailDTO);
        return ResponseEntity.ok().body(new PMDetailResponseVO(pmDetailDTO.getPm_detail_code()));

    }


    @GetMapping(value = {"/pmDetail"})
    public ResponseEntity<Object> getListPMD(@RequestParam(value = "page", defaultValue = "1") String page,
                                             @RequestParam(value = "searchType", defaultValue = "name") String searchType,
                                             @RequestParam(value = "searchContent", defaultValue = "") String searchContent ) {
        Criteria criteria = new Criteria();
        criteria.setPageNum(Integer.parseInt(page));
        criteria.setSearchType(searchType);
        criteria.setSearchContent(searchContent);

        List<PMDetailDTO> list = pmService.PMDfindAll(criteria);

        PageDto pageDto = new PageDto(5, pmService.getTotalRaw(), criteria);
        return ResponseEntity.ok().body(new ProductionMachineResponseVO(list, pageDto));
    }
    @PutMapping("/pmDetail")
    public ResponseEntity<Object> updatePMD(@RequestBody PMDetailsRequestVO productionMachineRequestVO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        PMDetailDTO productionMachineDTO = mapper.map(productionMachineRequestVO, PMDetailDTO.class);
        productionMachineDTO = pmService.PMDupdate(productionMachineDTO);
        return ResponseEntity.ok().body("성공");
    }

    @DeleteMapping("/pmDetail/{machine_code}")
    public ResponseEntity<Object> deletePMD(@PathVariable int machine_code) {
        pmService.PMDdelete(machine_code);
        return ResponseEntity.ok().body("성공");
    }
}


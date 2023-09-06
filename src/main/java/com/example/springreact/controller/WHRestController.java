package com.example.springreact.controller;

import com.example.springreact.dto.WarehousingRecordDTO;
import com.example.springreact.service.WarehousingRecordService;
import com.example.springreact.service.WarehousingRecordServiceImpl;
import com.example.springreact.vo.RequestVO.WHListRequestVO;
import com.example.springreact.vo.ResponseVO.StorageResponseVO;
import com.example.springreact.vo.ResponseVO.WHListResponseVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/*")
@AllArgsConstructor
public class WHRestController {

    WarehousingRecordService wh_service;

	@GetMapping("/wh/listByCode")
    public ResponseEntity<List<WHListResponseVO>> getListByCode(@RequestBody String Code){
        ModelMapper mapper = new ModelMapper();
        List<WHListResponseVO> resVO = wh_service.getListByCode(Code)
                .stream()
                .map(item -> mapper.map(item,WHListResponseVO.class))
                .collect(Collectors.toList());
        System.out.println("resVO : " + resVO);
        return ResponseEntity.ok(resVO);
    }

    @GetMapping("/wh/list")
    public ResponseEntity<List<WHListResponseVO>> getList() {
        ModelMapper mapper = new ModelMapper();
        List<WHListResponseVO> resVO = wh_service.getList()
                .stream()
                .map(item -> mapper.map(item,WHListResponseVO.class))
                .collect(Collectors.toList());
        System.out.println("resVO : " + resVO);
        return ResponseEntity.ok(resVO);
    }

    @GetMapping("/wh/GRlist")
    public ResponseEntity<List<WHListResponseVO>> getGRList(){
        ModelMapper mapper = new ModelMapper();
        List<WHListResponseVO> resVO = wh_service.getGRList()
                .stream()
                .map(item -> mapper.map(item,WHListResponseVO.class))
                .collect(Collectors.toList());
        System.out.println("resVO : " + resVO);
        return ResponseEntity.ok(resVO);
    }

    @GetMapping("/wh/GIList")
    public ResponseEntity<List<WHListResponseVO>> getGIList(){
        ModelMapper mapper = new ModelMapper();
        List<WHListResponseVO> resVO = wh_service.getGIList()
                .stream()
                .map(item -> mapper.map(item,WHListResponseVO.class))
                .collect(Collectors.toList());
        System.out.println("resVO : " + resVO);
        return ResponseEntity.ok(resVO);
    }

    @GetMapping("wh/CurrentList")
    public ResponseEntity<List<WHListResponseVO>> getCurrentList(){
        ModelMapper mapper = new ModelMapper();
        List<WHListResponseVO> resVO = wh_service.getCurrentList()
                .stream()
                .map(item -> mapper.map(item,WHListResponseVO.class))
                        .collect(Collectors.toList());

        System.out.println("resVO : " + resVO);
        return ResponseEntity.ok(resVO);
    }

    @PostMapping("/wh")
    public ResponseEntity<Integer> register(@RequestBody WHListRequestVO whListRequestVO){
        ModelMapper mapper = new ModelMapper();
        WarehousingRecordDTO whDto = mapper.map(whListRequestVO, WarehousingRecordDTO.class);
        System.out.println("WHDTO : " + whDto);
        return ResponseEntity.ok(wh_service.register(whDto));
    }

    @PutMapping("wh")
    public ResponseEntity<Integer> update(@RequestBody WHListRequestVO whListRequestVO){
        ModelMapper mapper = new ModelMapper();
        WarehousingRecordDTO whDto = mapper.map(whListRequestVO, WarehousingRecordDTO.class);
        System.out.println("WHDTO : " + whDto);
        return ResponseEntity.ok(wh_service.update(whDto));
    }

    @DeleteMapping("wh")
    public ResponseEntity<Integer> delete(@RequestBody String code){
        return ResponseEntity.ok(wh_service.delete(code));
    }
}

package com.example.springreact.controller;

import com.example.springreact.service.WarehousingRecordService;
import com.example.springreact.service.WarehousingRecordServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/*")
@AllArgsConstructor
public class WHRestController {

    WarehousingRecordService wh_service;

	@GetMapping("/wh/listByCode")
    public void getListByCode(@RequestBody String Code){
        wh_service.getListByCode(Code);
    }
}

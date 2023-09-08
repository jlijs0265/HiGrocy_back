package com.example.springreact.controller;

import com.example.springreact.domain.Account;
import com.example.springreact.dto.AccountDTO;
import com.example.springreact.dto.StorageDTO;
import com.example.springreact.service.AccountService;
import com.example.springreact.vo.RequestVO.StorageRequestVO;
import com.example.springreact.vo.RequestVO.accountRequestVO;
import com.example.springreact.vo.ResponseVO.StorageResponseVO;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class AccountRestController {
    public AccountService service;
    public AccountRestController(AccountService service){
        this.service = service;
    };

    @GetMapping("/account")
    public List<AccountDTO> getListAll(){
        return service.getListAll();
    }

    @GetMapping("/account/{account_code}")
    public Account getListOne(@PathVariable int account_code){
        return service.getListOne(account_code);
    }

    @PostMapping(value = "/account", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void ResponseEntity<Object> insert(@RequestBody accountRequestVO accountVO){
        ModelMapper modelMapper = new ModelMapper();
        AccountDTO accountDTO = modelMapper.map(accountVO,AccountDTO.class);
        System.out.println("accountDTO : " + accountDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new StorageResponseVO(service.insert(AccountDTO)));
    }

    @PostMapping(value="/storage", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> registerStorage(@RequestBody StorageRequestVO storegeRequestVO){

        //VO => DTO 변환
        ModelMapper modelMapper = new ModelMapper();
        StorageDTO storageDTO = modelMapper.map(storegeRequestVO,StorageDTO.class);
        System.out.println("storageDTO : " + storageDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new StorageResponseVO(service.register(storageDTO)));
    }

    @PutMapping("/account/{account_code}")
    public int update(@PathVariable int account_code, @RequestBody AccountDTO accountDTO){
        accountDTO.setAccount_code(account_code);
        return service.update(accountDTO);
    }



    @DeleteMapping("/account/{account_code}")
    public int delete(@PathVariable int account_code){
        return service.delete(account_code);
    }


}

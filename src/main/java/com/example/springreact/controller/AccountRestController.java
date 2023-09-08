package com.example.springreact.controller;

import com.example.springreact.domain.Account;
import com.example.springreact.dto.AccountDTO;
import com.example.springreact.service.AccountService;
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

    @PostMapping("/account")
    public void insert(@RequestBody AccountDTO accountDTO){
        service.insert(accountDTO);
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

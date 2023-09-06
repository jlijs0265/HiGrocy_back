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
    public List<Account> getListAll(){
        return service.getListAll();
    }

    @GetMapping("/account/{account_code}")
    public Account getListOne(@PathVariable int account_code){
        return service.getListOne(account_code);
    }

    @PostMapping("/account")
    public void insert(@RequestBody Account account){
        service.insert(account);
    }

    @PutMapping("/account/{account_code}")
    public int update(@PathVariable int account_code, @RequestBody Account account){
        account.setAccount_code(account_code);
        return service.update(account);
    }

    @DeleteMapping("/account/{account_code}")
    public int delete(@PathVariable int account_code){
        return service.delete(account_code);
    }


}

package com.example.springreact.service;

import com.example.springreact.domain.Account;
import com.example.springreact.domain.Storage;
import com.example.springreact.dto.AccountDTO;
import com.example.springreact.mapper.AccountMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper mapper;

    @Override
    public List<Account> getListAll() {
        return mapper.getListAll();
    }

    @Override
    public Account getListOne(int account_code) {
        return mapper.getListOne(account_code);
    }

    @Override
    public void insert(Account account) {
        mapper.insert(account);
        System.out.println("AccountServiceImpl : " + account);
    }

    @Override
    public int update(Account account) {
        System.out.println("AccountServiceImpl : " + account);
        return mapper.update(account);
    }

    @Override
    public int delete(int account_code) {
        return mapper.delete(account_code);
    }
}
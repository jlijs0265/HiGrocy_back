package com.example.springreact.service;

import com.example.springreact.domain.Account;
import com.example.springreact.dto.AccountDTO;
import com.example.springreact.dto.Criteria;
import com.example.springreact.mapper.AccountMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper mapper;

    @Override
    public List<AccountDTO> getListAll() {
        return mapper.getListAll();
    }

    @Override
    public Account getListOne(int account_code) {
        return mapper.getListOne(account_code);
    }

    @Override
    public void insert(AccountDTO accountDTO) {
        mapper.insert(accountDTO);
        System.out.println("AccountServiceImpl : " + accountDTO);
    }

    @Override
    public int update(AccountDTO accountDTO) {
        System.out.println("AccountServiceImpl : " + accountDTO);
        return mapper.update(accountDTO);
    }

    @Override
    public int delete(int account_code) {
        return mapper.delete(account_code);
    }

    @Override
    public List<AccountDTO> getList(Criteria criteria) {
        ModelMapper modelMapper = new ModelMapper();
        List<AccountDTO> accountList = mapper.getList(criteria)
                .stream()
                .map(item -> modelMapper.map(item, AccountDTO.class))
                .collect(Collectors.toList());

        return accountList;
    }

    @Override
    public int getTotal() {
        return mapper.getTotal();
    }
}
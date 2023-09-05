package com.example.springreact.service;

import com.example.springreact.domain.Account;
import com.example.springreact.dto.AccountDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    public List<Account> getListAll();
    public Account getListOne(int account_code);
    public void insert(AccountDTO accountDTO);
    public int update(AccountDTO accountDTO);
    public int delete(int account_code);

}

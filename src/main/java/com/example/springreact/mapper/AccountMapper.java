package com.example.springreact.mapper;

import com.example.springreact.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    public List<Account> getListAll();
    public Account getListOne(int account_code);
    public void insert(Account account);
    public int update(Account account);
    public int delete(int account_code);

}

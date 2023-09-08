package com.example.springreact.mapper;

import com.example.springreact.domain.Account;
import com.example.springreact.dto.AccountDTO;
import com.example.springreact.dto.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    public List<AccountDTO> getListAll();
    public Account getListOne(int account_code);
    public void insert(AccountDTO accountDTO);
    public int update(AccountDTO accountDTO);
    public int delete(int account_code);

    public List<Account> getList(Criteria criteria);

    int getTotal();

}
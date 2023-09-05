package com.example.springreact.service;

import com.example.springreact.domain.Item;
import com.example.springreact.mapper.RawMaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RawMaterialServiceImpl implements RawMaterialService{


    @Autowired
    private RawMaterialMapper mapper;


    @Override
    public void registerItem(Item item) {
        mapper.registerItem(item);
    }
}

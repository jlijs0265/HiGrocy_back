package com.example.springreact.service;

import com.example.springreact.domain.OrderDetail;
import com.example.springreact.mapper.OrderDetailMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
    @Autowired
    private OrderDetailMapper mapper;

    @Override
    public List<OrderDetail> getList() {
        return mapper.getList();
    }

    @Override
    public OrderDetail getListOne(String order_code) {
        return mapper.getListOne(order_code);
    }

    @Override
    public void insert(OrderDetail orderDetail) {
        mapper.insert(orderDetail);
    }

    @Override
    public int update(OrderDetail orderDetail) {
        return mapper.update(orderDetail);
    }

    @Override
    public int delete(String order_code) {
        return mapper.delete(order_code);
    }
}

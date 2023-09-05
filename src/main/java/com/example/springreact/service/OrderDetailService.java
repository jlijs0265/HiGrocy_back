package com.example.springreact.service;

import com.example.springreact.domain.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    public List<OrderDetail> getList();
    public OrderDetail getListOne(String order_code);
    public void insert(OrderDetail orderDetail);
    public int update(OrderDetail orderDetail);
    public int delete(String order_code);
}

package com.example.springreact.service;

import com.example.springreact.domain.BetweenDate;
import com.example.springreact.domain.ItemOrder;
import com.example.springreact.domain.OrderDetail;
import com.example.springreact.dto.BetweenDateDTO;
import com.example.springreact.dto.OrderDetailDTO;

import java.util.List;

public interface OrderDetailService {

    public void insert(OrderDetailDTO orderDetailDTO);
    public List<ItemOrder> selectDate(BetweenDateDTO betweenDateDTO);
    public List<OrderDetailDTO> selectItem(String order_code);

}

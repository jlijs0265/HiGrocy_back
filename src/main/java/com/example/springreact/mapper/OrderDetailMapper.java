package com.example.springreact.mapper;

import com.example.springreact.domain.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    public List<OrderDetail> getList();
    public OrderDetail getListOne(String order_code);
    public void insert(OrderDetail orderDetail);
    public int update(OrderDetail orderDetail);
    public int delete(String order_code);

}

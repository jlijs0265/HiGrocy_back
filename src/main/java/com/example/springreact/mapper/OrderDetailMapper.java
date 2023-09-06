package com.example.springreact.mapper;

import com.example.springreact.domain.ItemOrder;
import com.example.springreact.domain.OrderDetail;
import com.example.springreact.dto.BetweenDateDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    public void insert(OrderDetail orderDetail);

    public List<OrderDetail> selectItem(String order_code);

    public List<ItemOrder> selectBetween(BetweenDateDTO betweenDateDTO);

}

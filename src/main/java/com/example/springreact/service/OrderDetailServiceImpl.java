package com.example.springreact.service;

import com.example.springreact.domain.BetweenDate;
import com.example.springreact.domain.ItemOrder;
import com.example.springreact.domain.OrderDetail;
import com.example.springreact.dto.BetweenDateDTO;
import com.example.springreact.dto.OrderDetailDTO;
import com.example.springreact.mapper.OrderDetailMapper;
import com.example.springreact.mapper.RawMaterialMapper;
import lombok.AllArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService{
    @Autowired
    private OrderDetailMapper mapper;
    @Autowired
    private RawMaterialMapper item_mapper;

    @Override
    public void insert(OrderDetailDTO orderDetailDTO) {

        ModelMapper modelMapper = new ModelMapper();
        OrderDetail orderDetail = modelMapper.map(orderDetailDTO,OrderDetail.class);

        mapper.insert(orderDetail);
        OrderDetailDTO orderDetailDto = modelMapper.map(orderDetail, OrderDetailDTO.class);

    }


    @Override
    public List<ItemOrder> selectDate(BetweenDateDTO betweenDateDTO) {
        return mapper.selectBetween(betweenDateDTO);
    }

    @Override
    public List<OrderDetailDTO> selectItem(String order_code) {
        ModelMapper modelMapper = new ModelMapper();
        List<OrderDetail> orderDetails = mapper.selectItem(order_code);
        List<OrderDetailDTO> OrderDetailList = orderDetails
                .stream()
                .map(item -> modelMapper.map(item, OrderDetailDTO.class))
                .collect(Collectors.toList());

        return OrderDetailList;
    }

}

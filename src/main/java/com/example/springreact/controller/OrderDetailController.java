package com.example.springreact.controller;

import com.example.springreact.domain.OrderDetail;
import com.example.springreact.dto.OrderDetailDTO;
import com.example.springreact.service.OrderDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailController {
    private OrderDetailService service;
    public OrderDetailController(OrderDetailService service){
        this.service = service;
    };

    @GetMapping("/order")
    public List<OrderDetailDTO> selectItem(String order_code){
        return service.selectItem(order_code);
    }

//    @GetMapping("/order/{order_code}")
//    public OrderDetail getListone(@PathVariable String order_code){
//        return service.getListOne(order_code);
//    }
//
//    @PostMapping("/order")
//    public void insert(@RequestBody OrderDetailDTO orderDetailDTO){
//        service.insert(orderDetailDTO);
//    }

}

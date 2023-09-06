package com.example.springreact.controller;

import com.example.springreact.service.OrderDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class OrderDetailController {
    private OrderDetailService service;
    public OrderDetailController(){
        this.service = service;
    };



}

package com.example.springreact.domain;

import lombok.Data;

import java.util.List;

@Data
public class TotalList {
	List<com.example.springreact.domain.OrderDetail> orderList;
	ItemOrder orderRecord;
}
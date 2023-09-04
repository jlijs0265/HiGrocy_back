package com.example.springreact.domain;

import lombok.Data;

import java.util.List;

@Data
public class TotalList {
	List<com.example.springreact.domain.orderList> orderList;
	com.example.springreact.domain.orderRecord orderRecord;
}
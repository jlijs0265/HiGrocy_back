package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class TotalListRequestVO {
	List<orderListRequestVO> orderList;
	orderRecordRequestVO orderRecord;
}
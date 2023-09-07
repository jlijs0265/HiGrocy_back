package com.example.springreact.vo.ResponseVO;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.Storage;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WHListResponseVO {
	//입출고 내역 코드
	private String warehousing_code;
	//품목 코드
	private int item_code;
	//창고 코드
	private int storage_code;
	//입출고 유형
	private String warehousing_type;
	//입출고 날짜
	private String wr_date;
	//재고 수량
	private int amount;
	//유통기한
	private String keeping_date;
	//아이템 객체 리스트
	private Item item;
	//창고 객체 리스트
	private Storage storage;


}

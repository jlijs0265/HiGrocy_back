package com.example.springreact.dto;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.Storage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WarehousingRecordDTO {
	//입출고 내역 코드
	private String warehousing_code;
	//품목 코드
	private int item_code;
	//창고 코드
	private int storage_code;
	//입출고 유형
	private String warehousing_type;
	//입출고 날짜
	private Date wr_date;
	//재고 수량
	private int amount;
	//유통기한
	private Date keeping_date;
	//아이템 객체 리스트
	private Item item;
	//창고 객체 리스트
	private Storage storage;

}

package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class DateEcoRequestVO {
		private int machine_code;
		private String type;
		private int green_gas_date;
		private int energy_date;
		private Date sdate;
		private double total;
}

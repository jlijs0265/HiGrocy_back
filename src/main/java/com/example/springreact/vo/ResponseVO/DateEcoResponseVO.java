package com.example.springreact.vo.ResponseVO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@AllArgsConstructor
@Getter
public class DateEcoResponseVO {
		private int machine_code;
		private String type;
		private int green_gas_date;
		private int energy_date;
		private Date sdate;
		private double total;
}

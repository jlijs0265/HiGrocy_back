package com.example.springreact.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class DateEco {
		private int machine_code;
		private String type;
		private int green_gas_date;
		private int energy_date;
		private Date sdate;
		private double total;
}

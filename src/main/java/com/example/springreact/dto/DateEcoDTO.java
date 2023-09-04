package com.example.springreact.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DateEcoDTO {
		private int machine_code;
		private String type;
		private int green_gas_date;
		private int energy_date;
		private Date sdate;
		private double total;
}

package com.example.springreact.domain;

import lombok.Data;

import java.util.Date;

@Data
public class PR {
    private String pr_code;
    private Date request_date;
    private String request_manager;
}

package com.example.springreact.dto;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Data
@Component
public class Criteria {
    private int pageNum;
    private int amount;
    private String searchType;
    private String searchContent;


    // 기본
    public Criteria() {
        this.pageNum = 1;
        this.amount = 10;
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    // URIComponentsBuilder를 이용하여 링크 새성

    public String[] getTypeArr() {
        return searchType == null ? new String[]{} : searchType.split("");
    }

}

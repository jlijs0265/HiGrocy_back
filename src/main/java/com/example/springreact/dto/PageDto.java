package com.example.springreact.dto;

import lombok.Data;

@Data
public class PageDto {

    private int pageCount; // 화면에 출력할 페이지 사이즈
    private int startPage;
    private int endPage;
    private int realEnd; // 실제 마지막 page 번호 - endPage가 realEnd보다 클 수 없음
    private boolean prev, next;
    private int total; // 전체 데이터의 개수
    private Criteria criteria;


    public PageDto() {
    };

    public PageDto(int pageCount, int total, Criteria criteria) {
        this.pageCount = pageCount;
        this.total = total;
        this.criteria = criteria;


        this.endPage = (int)(Math.ceil(criteria.getPageNum()*1.0 / pageCount)) * pageCount;
        this.startPage = endPage - (pageCount -1);

        realEnd = (int)(Math.ceil(total*1.0 / criteria.getAmount()));

        if(endPage > realEnd) {
            endPage = realEnd == 0? 1 : realEnd;
        }

        prev = startPage > 1;
        next = endPage < realEnd;
    }
}

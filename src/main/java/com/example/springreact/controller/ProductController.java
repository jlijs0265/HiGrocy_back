package com.example.springreact.controller;

import com.example.springreact.vo.ResponseVO.ProductResponseVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    // 데이터 가져오기
    @GetMapping("/product")
    public ResponseEntity<List<ProductResponseVO>> getProductList() {
        
        return null;
    }

}

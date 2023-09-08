package com.example.springreact.vo.RequestVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductionRequestVO {

    private String name;
    // 파일
    private String image_file;
    private List<BomRequestVO> bomRequestVOList;

}

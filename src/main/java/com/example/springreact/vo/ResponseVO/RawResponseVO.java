package com.example.springreact.vo.ResponseVO;

import com.example.springreact.dto.PageDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawResponseVO {

    List<RawMaterialResponseVO> list;
    PageDto pageDto;
}
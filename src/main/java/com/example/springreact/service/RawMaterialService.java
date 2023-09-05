package com.example.springreact.service;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.vo.RequestVO.RawMaterialRequestVO;

import java.util.List;

public interface RawMaterialService {
    public int registerItem(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO);
    List<RawMaterialDTO> getRawMaterialList();

}

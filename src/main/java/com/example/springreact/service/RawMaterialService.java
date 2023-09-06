package com.example.springreact.service;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.vo.RequestVO.RawMaterialRequestVO;
import com.example.springreact.vo.ResponseVO.RawMaterialResponseVO;

import java.util.ArrayList;
import java.util.List;

public interface RawMaterialService {
    public int registerItem(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO);
    public ArrayList<RawMaterialResponseVO> getRawMaterialList();
    public RawMaterialResponseVO getRawMaterial(int raw_materials_code);

    public void updateRawMaterial(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO);
    public void deleteRawMaterial(int raw_materials_code);

}

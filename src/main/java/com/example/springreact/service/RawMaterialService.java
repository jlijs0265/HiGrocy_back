package com.example.springreact.service;

import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.dto.PageDto;
import com.example.springreact.vo.ResponseVO.RawMaterialResponseVO;

import java.util.ArrayList;

public interface RawMaterialService {
    public int registerItem(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO);
    public ArrayList<RawMaterialResponseVO> getRawMaterialList(Criteria criteria);
    public RawMaterialResponseVO getRawMaterial(int raw_materials_code);

    public void updateRawMaterial(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO);
    public void deleteRawMaterial(int raw_materials_code);
    public int getTotalRaw();

}

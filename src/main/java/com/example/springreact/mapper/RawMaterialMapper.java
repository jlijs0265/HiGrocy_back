package com.example.springreact.mapper;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RawMaterialMapper {

    public void registerItem(Item item);
    public int registerRawMaterial(RawMaterials rawMaterials);

    List<RawMaterialDTO> getRawMaterialList(Criteria criteria);

    RawMaterialDTO getRawMaterial(int raw_materials_code);

    void updateItem(Item item);
    void updateRawMaterial(RawMaterials rawMaterials);

    void deleteRawMaterial(int raw_materials_code);
    int getTotalRaw();
}

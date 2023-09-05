package com.example.springreact.mapper;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.RawMaterialDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RawMaterialMapper {

    public void registerItem(Item item);
    public int registerRawMaterial(RawMaterials rawMaterials);

    List<RawMaterialDTO> getRawMaterialList();

}

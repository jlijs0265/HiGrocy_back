package com.example.springreact.service;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.mapper.RawMaterialMapper;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Log
public class RawMaterialServiceImpl implements RawMaterialService{


    @Autowired
    private RawMaterialMapper rawMaterialMapper;


    @Transactional
    @Override
    public int registerItem(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Item item = mapper.map(itemDTO, Item.class);
        rawMaterialMapper.registerItem(item);
        int item_code = item.getItem_code();

        RawMaterials rawMaterials = mapper.map(rawMaterialDTO, RawMaterials.class);
        rawMaterials.setItem_code(item_code);
        log.info("원부자재 : " + rawMaterials.toString());

        int result = rawMaterialMapper.registerRawMaterial(rawMaterials);

        return result;
    }

    @Override
    public List<RawMaterialDTO> getRawMaterialList() {
        List<RawMaterialDTO> rawList = rawMaterialMapper.getRawMaterialList();
        rawList.forEach((raw) -> {log.info(raw.toString());});
        return null;
    }
}

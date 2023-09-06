package com.example.springreact.service;

import com.example.springreact.domain.Item;
import com.example.springreact.domain.RawMaterials;
import com.example.springreact.dto.ItemDTO;
import com.example.springreact.dto.RawMaterialDTO;
import com.example.springreact.mapper.RawMaterialMapper;
import com.example.springreact.vo.ResponseVO.RawMaterialResponseVO;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

        rawMaterialMapper.registerRawMaterial(rawMaterials);

        return item_code;
    }

    @Override
    public ArrayList<RawMaterialResponseVO> getRawMaterialList() {
        List<RawMaterialDTO> rawList = rawMaterialMapper.getRawMaterialList();

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ArrayList<RawMaterialResponseVO> rawMaterialResponseVOList = new ArrayList<RawMaterialResponseVO>();
        rawList.forEach((raw) -> {
            RawMaterialResponseVO responseVo = mapper.map(raw, RawMaterialResponseVO.class);
            responseVo.setName(raw.getItem().getName());
            responseVo.setVolume(raw.getItem().getVolume());
            rawMaterialResponseVOList.add(responseVo);
        });
        return rawMaterialResponseVOList;

    }
    @Override
    public RawMaterialResponseVO getRawMaterial(int raw_materials_code) {
        RawMaterialDTO dto = rawMaterialMapper.getRawMaterial(raw_materials_code);
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        RawMaterialResponseVO rawMaterialResponseVO = mapper.map(dto, RawMaterialResponseVO.class);
        rawMaterialResponseVO.setName(dto.getItem().getName());
        rawMaterialResponseVO.setVolume(dto.getItem().getVolume());
        return rawMaterialResponseVO;
    }

    @Transactional
    @Override
    public void updateRawMaterial(RawMaterialDTO rawMaterialDTO, ItemDTO itemDTO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Item item = mapper.map(itemDTO, Item.class);
        log.info(item.toString());
        rawMaterialMapper.updateItem(item);

        RawMaterials rawMaterials = mapper.map(rawMaterialDTO, RawMaterials.class);
        log.info(rawMaterials.toString());
        rawMaterialMapper.updateRawMaterial(rawMaterials);


    }

    @Override
    public void deleteRawMaterial(int raw_materials_code) {
        rawMaterialMapper.deleteRawMaterial(raw_materials_code);
    }


}

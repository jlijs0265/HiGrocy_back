package com.example.springreact.mapper;

import com.example.springreact.domain.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RawMaterialMapper {

    public void registerItem(Item item);


}

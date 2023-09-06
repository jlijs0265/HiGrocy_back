package com.example.springreact.mapper;

import com.example.springreact.domain.ProductionMachine;
import com.example.springreact.dto.ProductionMachineDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PMMapper {
    boolean save(ProductionMachine productionMachine);
}

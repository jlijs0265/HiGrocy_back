package com.example.springreact.mapper;

import com.example.springreact.domain.ProductionMachine;
import com.example.springreact.dto.ProductionMachineDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Arrays;
import java.util.List;

@Mapper
public interface PMMapper {
    boolean save(ProductionMachine productionMachine);

    List<ProductionMachine> findAll();

    boolean update(ProductionMachine productionMachine);

    boolean delete(int machine_code);
}

package com.example.springreact.service;

import com.example.springreact.domain.ProductionMachine;
import com.example.springreact.dto.ProductionMachineDTO;
import com.example.springreact.mapper.PMMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
public class PMService {
    private PMMapper pmMapper;

    public PMService(PMMapper pmMapper) {
        this.pmMapper = pmMapper;
    }

    public ProductionMachineDTO save(ProductionMachineDTO productionMachineDTO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachine productionMachine = mapper.map(productionMachineDTO, ProductionMachine.class);
        boolean result = pmMapper.save(productionMachine);
        productionMachineDTO = mapper.map(productionMachine, ProductionMachineDTO.class);

        return productionMachineDTO;
    }
}

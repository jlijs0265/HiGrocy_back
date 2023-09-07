package com.example.springreact.service;

import com.example.springreact.domain.PMDetails;
import com.example.springreact.domain.ProductionMachine;
import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.PMDetailDTO;
import com.example.springreact.dto.ProductionMachineDTO;
import com.example.springreact.mapper.PMDetailMapper;
import com.example.springreact.mapper.PMMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PMService {
    private PMMapper pmMapper;
    private PMDetailMapper pmDetailMapper;

    public PMService(PMMapper pmMapper, PMDetailMapper pmDetailMapper) {
        this.pmMapper = pmMapper;
        this.pmDetailMapper = pmDetailMapper;
    }

    public ProductionMachineDTO PMsave(ProductionMachineDTO productionMachineDTO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachine productionMachine = mapper.map(productionMachineDTO, ProductionMachine.class);
        boolean result = pmMapper.save(productionMachine);
        productionMachineDTO = mapper.map(productionMachine, ProductionMachineDTO.class);

        return productionMachineDTO;
    }

    public List<ProductionMachineDTO> PMfindAll() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);


        List<ProductionMachineDTO> list = pmMapper.findAll()
                .stream()
                .map(p -> mapper.map(p, ProductionMachineDTO.class))
                .collect(Collectors.toList());
        return list;
    }

    public ProductionMachineDTO PMupdate(ProductionMachineDTO productionMachineDTO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductionMachine productionMachine = mapper.map(productionMachineDTO, ProductionMachine.class);
        boolean result = pmMapper.update(productionMachine);
        productionMachineDTO = mapper.map(productionMachine, ProductionMachineDTO.class);
        return productionMachineDTO;
    }

    public void PMdelete(int machine_code) {
        boolean result = pmMapper.delete(machine_code);
    }

    public PMDetailDTO PMDsave(PMDetailDTO pmDetailDTO) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        PMDetails pmDetails = mapper.map(pmDetailDTO, PMDetails.class);
        boolean result = pmDetailMapper.save(pmDetails);
        pmDetailDTO = mapper.map(pmDetails, PMDetailDTO.class);

        return pmDetailDTO;
    }

    public List<PMDetailDTO> PMDfindAll(Criteria criteria) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);


        List<PMDetailDTO> list = pmDetailMapper.findAll(criteria)
                .stream()
                .map(p -> mapper.map(p, PMDetailDTO.class))
                .collect(Collectors.toList());
        return list;
    }

    public PMDetailDTO PMDupdate(PMDetailDTO productionMachineDTO) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        PMDetails pmDetails = mapper.map(productionMachineDTO, PMDetails.class);
        boolean result = pmDetailMapper.update(pmDetails);
        productionMachineDTO = mapper.map(pmDetails, PMDetailDTO.class);
        return productionMachineDTO;
    }

    public void PMDdelete(int machine_code) {
        boolean result = pmDetailMapper.delete(machine_code);
    }
    public int getTotalRaw() {
        return pmDetailMapper.getTotalRaw();
    }

}

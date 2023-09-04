package com.example.springreact.service;

import com.example.springreact.domain.ProductionMachine;
import com.example.springreact.dto.ProductionMachineDTO;
import com.example.springreact.dto.StorageDTO;

import java.util.List;

public interface ProductionMachineService {
	int registerProductionMachine(ProductionMachineDTO productionMachineDTO);
	int updateProductionMachine(ProductionMachineDTO productionMachineDTO);
	int deleteProductionMachine(int code);
	ProductionMachineDTO getOnceProductionMachine(int code);
	List<ProductionMachineDTO > getProductionMachine();
}

package com.example.springreact.controller;

import com.example.springreact.domain.Storage;
import com.example.springreact.dto.Criteria;
import com.example.springreact.dto.PageDto;
import com.example.springreact.dto.StorageDTO;
import com.example.springreact.service.StorageService;
import com.example.springreact.vo.RequestVO.StorageRequestVO;
import com.example.springreact.vo.ResponseVO.ResponseVO;
import com.example.springreact.vo.ResponseVO.StorageResponseVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/*")
//@Log4j
@AllArgsConstructor
public class StorageRestController {

	@Autowired
	private StorageService service;

	  @PostMapping(value="/storage", consumes = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<String> registerStorage(@RequestBody StorageRequestVO storegeRequestVO){

		  System.out.println("Storage register..........");
		  System.out.println("vo입니다 : "+storegeRequestVO);

		  //VO => DTO 변환
		  ModelMapper modelMapper = new ModelMapper();
		  StorageDTO storageDTO = modelMapper.map(storegeRequestVO,StorageDTO.class);
		  System.out.println("storageDTO : " + storageDTO);
		  return ResponseEntity.status(HttpStatus.OK).body(service.register(storageDTO)+"");
		  }

	@PutMapping(value="/storage", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateStorage(@RequestBody StorageRequestVO storegeRequestVO){

		//VO => DTO
		ModelMapper modelMapper = new ModelMapper();
		StorageDTO storageDTO = modelMapper.map(storegeRequestVO,StorageDTO.class);
		System.out.println("storageDTO : " + storageDTO);

		  return service.update(storageDTO) ==1 ? new ResponseEntity<>("success",
		  HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@DeleteMapping(value = "/storage/{code}")
	public ResponseEntity<String> deleteStorage(@PathVariable int code) {
			System.out.println("CODE : " + code);
		  return service.delete(code) == 1 ? new
		  ResponseEntity<>("success",HttpStatus.OK) : new
		  ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/storage/list")
	public ResponseEntity<ResponseVO> getStorageList(@RequestParam(value = "page", defaultValue = "1") String page) {
		Criteria criteria = new Criteria();
		if(page != null) {
			criteria.setPageNum(Integer.parseInt(page));
		}
		List<StorageDTO> storageDTOList = service.getList(criteria);

		List<StorageResponseVO> storageResponseVOList = storageDTOList.stream()
				.map(dto -> new StorageResponseVO(
						dto.getStorage_code(),
						dto.getName(),
						dto.getLocation(),
						dto.getManager(),
						dto.getMax_loadage()
				))
				.collect(Collectors.toList());
		System.out.println("StorageResponseVOList : "+ storageResponseVOList);
		PageDto pageDto = new PageDto(5, service.getTotal(), criteria);
		System.out.println("Storage Page : "+ pageDto);
		ResponseVO response = new ResponseVO(storageResponseVOList, pageDto);
		return storageResponseVOList != null ? ResponseEntity.status(HttpStatus.OK).body(response)
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//		return new ResponseEntity<>(storageResponseVOList, HttpStatus.OK);
	}
}

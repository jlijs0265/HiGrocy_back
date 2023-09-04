//package com.example.springreact.controller;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.log4j.Log4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/*")
//@Log4j
//@AllArgsConstructor
//public class WHRestController {
//
//	private WHService service;
//
//	@PostMapping(value = "insert/wh", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> register(@RequestBody WHListVO vo){
//		log.info("Post!!! "+ vo);
//		return service.register(vo) ==1 ? new ResponseEntity<>("success",
//				  HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//
//	@PutMapping(value = "/wh", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> update(@RequestBody WHListVO vo){
//		log.info("Put!!!" + vo);
//		return service.update(vo) ==1 ? new ResponseEntity<>("success",
//				  HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//
//	@DeleteMapping(value = "/wh", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> delete(@RequestBody int code){
//		log.info("Delete!!!" + code);
//		return service.delete(code) ==1 ? new ResponseEntity<>("success",
//				  HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//}

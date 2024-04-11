package com.folder.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.folder.server.dto.ResultDto;
import com.folder.server.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DataController {
	
	@GetMapping("/")
	public String home() {
		return "Data 준비 중...";
	}
	
	@GetMapping("/api")
	public String api() {
		return "api 준비 중...";
	}
	
	@Autowired UserService uService;
	
	@PostMapping("/findAll")
	public ResultDto findAll() {
		return uService.findAll();
		
	}
	
	@PostMapping("/editById")
	public ResultDto editById() {
		return null;
	}
	
	@DeleteMapping("/delete")
	public ResultDto delete() {
		return null;
	}
	
	@PutMapping("/save")
	public ResultDto save() {
		return null;
	}
}

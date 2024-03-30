package com.folder.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class DataController {

  @CrossOrigin(origins = "http://localhost:5173")

  @GetMapping("/")
  public String home() {
    return "김상훈 test routing v1";
  }

  @GetMapping("/api")
  public String api() {
    return "김상훈 test api v1";
  }

  @PostMapping("/findAll")
  public ResultDTO findAll() {
    return null;
  }

  @PostMapping("/editById")
  public ResultDTO editById() {
    return null;
  }

  @DeleteMapping("/delete")
  public ResultDTO delete() {
    return null;
  }
  
  @PutMapping("/save")
  public ResultDTO save() {
    return null;
  }
}
package com.folder.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/")
    public String home() {
        return "김상훈 test v1";
    }
}
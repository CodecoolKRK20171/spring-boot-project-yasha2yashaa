package com.codecool.springbootrestapi.controllers;

import com.codecool.springbootrestapi.services.FatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fathers")
public class FatherController {
    FatherService fatherService;

    public FatherController(@Autowired FatherService fatherService) {
        this.fatherService = fatherService;
    }
}

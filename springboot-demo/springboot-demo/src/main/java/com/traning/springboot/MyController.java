package com.traning.springboot;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
class MyController{
    @GetMapping(value = "/name")
    public String getName(){
        return "Vikram Jha";
    }}
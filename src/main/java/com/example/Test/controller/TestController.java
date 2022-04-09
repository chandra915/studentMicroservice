package com.example.Test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class TestController {


//    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    @GetMapping("/test")
    public String test()
    {
        return "Microservice Running !!!";
    }



}

package com.yrk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ribbonController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String dc(){
        return  restTemplate.getForObject("http://ribbon-provider/dc",String.class);
    }
}

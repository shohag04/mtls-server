package com.mih.mtls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoContoller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
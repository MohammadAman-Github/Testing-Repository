package com.aman.sample.repositorytesting1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testing_controller1 {

    @RequestMapping("hello")
    public String hello() {
        return "hello world chin tapaak dam dam";
    }

}

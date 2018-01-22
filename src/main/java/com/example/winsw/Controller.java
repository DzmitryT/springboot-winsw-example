package com.example.winsw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String rootContext() {
        return "<h1>Windows service is running!</h1>";
    }
}

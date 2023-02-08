package com.chae.springbootproject.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingController {
    @GetMapping("/setting/title")
    public String test() {
        return "Hello, world!";
    }
}

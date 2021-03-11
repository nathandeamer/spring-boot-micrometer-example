package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public String get() throws Exception {
        return demoService.get();
    }

    @GetMapping("/error")
    public void error() throws Exception {
        throw new RuntimeException("Sorry, something went wrong");
    }

}

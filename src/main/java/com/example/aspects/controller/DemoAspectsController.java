package com.example.aspects.controller;

import com.example.aspects.service.DemoAspectsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DemoAspectsController {

    private final DemoAspectsService demoAspectsService;


    @GetMapping("/getSomething")
    public String getSomething() {
        log.info("Controller: getSomething");
        return demoAspectsService.getSomething();
    }


    @GetMapping("/getSomethingElse")
    public String getSomethingElse() {
        log.info("Controller: getSomethingElse");
        return demoAspectsService.getSomethingElse();
    }
}

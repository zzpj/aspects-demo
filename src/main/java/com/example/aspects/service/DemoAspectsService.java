package com.example.aspects.service;


import com.example.aspects.repository.DemoAspectsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DemoAspectsService {

    private final DemoAspectsRepository demoAspectsRepository;

    public String getSomething() {
        log.info("Service: getSomething");
        return getSomethingString();
    }

    private String getSomethingString() {
        log.info("Service: getSomethingString");
        return "Hello";
    }

    public String getSomethingElse() {
        log.info("Service: getSomethingElse");
        return demoAspectsRepository.getSomethingElse();
    }
}

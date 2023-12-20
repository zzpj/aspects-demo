package com.example.aspects.repository;


import org.springframework.stereotype.Repository;

@Repository
public class DemoAspectsRepository {

    public String getSomethingElse() {
        return "Bye";
    }
}

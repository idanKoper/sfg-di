package com.koper.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World- I was injected by Setter";
    }

}

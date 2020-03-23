package com.koper.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GUROS = "Hello Guros!!!  - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GUROS;
    }
}

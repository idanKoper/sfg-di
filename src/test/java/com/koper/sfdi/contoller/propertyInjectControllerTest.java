package com.koper.sfdi.contoller;

import com.koper.sfdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class propertyInjectControllerTest {

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();

    }

    PropertyInjectedController controller;

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
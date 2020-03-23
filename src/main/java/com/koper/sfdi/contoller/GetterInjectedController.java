package com.koper.sfdi.contoller;

import com.koper.sfdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}

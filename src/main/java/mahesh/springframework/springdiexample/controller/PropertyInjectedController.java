package mahesh.springframework.springdiexample.controller;

import mahesh.springframework.springdiexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyBasedGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

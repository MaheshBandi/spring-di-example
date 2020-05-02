package mahesh.springframework.springdiexample.controller;

import mahesh.springframework.springdiexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedInjectedController {
    GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterBasedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreeting();
    }
}

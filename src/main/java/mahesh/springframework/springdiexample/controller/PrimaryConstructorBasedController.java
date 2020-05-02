package mahesh.springframework.springdiexample.controller;

import mahesh.springframework.springdiexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryConstructorBasedController {
    private GreetingService greetingService;

    public PrimaryConstructorBasedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreeting();
    }
}

package mahesh.springframework.springdiexample.controller;

import mahesh.springframework.springdiexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController  {

    private  final GreetingService greetingService;

    public I18nController(@Qualifier(value = "i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

    return greetingService.sayGreeting();
    }
}

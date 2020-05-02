package mahesh.springframework.springdiexample.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from setter based";
    }
}

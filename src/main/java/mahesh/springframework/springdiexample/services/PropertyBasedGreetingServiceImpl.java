package mahesh.springframework.springdiexample.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyBasedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from english property based";
    }
}

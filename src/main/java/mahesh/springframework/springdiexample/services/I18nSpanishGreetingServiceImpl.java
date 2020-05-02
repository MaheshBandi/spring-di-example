package mahesh.springframework.springdiexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile(value = {"ES","default"})
@Service(value = "i18Service")
public class I18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Spanish Greeting Service";
    }
}

package mahesh.springframework.springdiexample.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile(value = "EN")
@Service(value = "i18Service")
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "English Greeting Service";
    }
}

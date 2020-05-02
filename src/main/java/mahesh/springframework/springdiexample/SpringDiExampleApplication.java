package mahesh.springframework.springdiexample;

import mahesh.springframework.springdiexample.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiExampleApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiExampleApplication.class, args);
		MyController myController = context.getBean("myController", MyController.class);
		System.out.println(myController.sayHello());

		//Property based injection
		PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println("propertyInjectedController-"+propertyInjectedController.getGreeting());

		//Setter Based Injection
		SetterBasedInjectedController setterBasedInjectedController = context.getBean("setterBasedInjectedController", SetterBasedInjectedController.class);
		System.out.println("setterBasedInjectedController-"+setterBasedInjectedController.getGreetings());

		//Constructor Based Injection
		ConstructorBasedController constructorBasedController = context.getBean("constructorBasedController",ConstructorBasedController.class);
		System.out.println("ConstructorBasedController-"+constructorBasedController.getGreetings());

		//Primary Based Injection
		PrimaryConstructorBasedController primaryConstructorBasedController = context.getBean("primaryConstructorBasedController",PrimaryConstructorBasedController.class);
		System.out.println(primaryConstructorBasedController.getGreetings());

		I18nController i18nController = context.getBean("i18nController",I18nController.class);
		System.out.println(i18nController.sayHello());
	}
}

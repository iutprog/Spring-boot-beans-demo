package com.example.beansdemo;

import java.time.Clock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Runs once after the context is fully started and prints the bean-vs-object difference.
 */
@Component
public class ContextInspector implements CommandLineRunner {

    private final ApplicationContext context;
    private final GreetingService injected;

    public ContextInspector(ApplicationContext context, GreetingService injected) {
        this.context = context;
        this.injected = injected;
    }

    @Override
    public void run(String... args) {
        GreetingService fromContext = context.getBean(GreetingService.class);
        GreetingService manual = new GreetingService(Clock.systemUTC()); // plain Java object

        System.out.println(">>> injected == context.getBean(...) ? " + (injected == fromContext));
        System.out.println(">>> injected == new GreetingService(...) ? " + (injected == manual));
        System.out.println(">>> GreetingService beans in context: "
                + context.getBeansOfType(GreetingService.class).size()
                + " (the 'new' one is not registered)");
        System.out.println(">>> Try: http://localhost:8080/greet  and  http://localhost:8080/actuator/beans");
    }
}

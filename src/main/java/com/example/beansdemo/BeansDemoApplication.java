package com.example.beansdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeansDemoApplication {

    public static void main(String[] args) {
        // run(...) builds and returns the ApplicationContext: the IoC container itself.
        ConfigurableApplicationContext context = SpringApplication.run(BeansDemoApplication.class, args);
        System.out.println(">>> Container ready: " + context.getClass().getSimpleName()
                + " with " + context.getBeanDefinitionCount() + " bean definitions");
    }
}

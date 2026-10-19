package com.example.beansdemo.Config;

import java.time.Clock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Way #1 to register a bean: a @Bean factory method.
 * Use this for classes you don't own (Clock is a JDK class, you can't put @Component on it).
 */
@Configuration("clockConfig")
public class AppConfig {

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }
}

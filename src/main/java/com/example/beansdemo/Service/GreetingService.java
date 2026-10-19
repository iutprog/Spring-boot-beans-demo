package com.example.beansdemo.Service;

import java.time.Clock;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

/**
 * Way #2 to register a bean: component scanning (@Service is a @Component).
 * Spring calls this constructor and supplies the Clock bean from AppConfig.
 */
@Service
public class GreetingService {

    private final Clock clock;

    // One shared instance serves every request (singleton scope), so shared state must be thread-safe.
    private final AtomicInteger calls = new AtomicInteger();

    public GreetingService(Clock clock) {
        this.clock = clock;
        System.out.println(">>> GreetingService constructed, instance id = " + System.identityHashCode(this));
    }

    public String greet(String name) {
        return "Hello %s, it's %s (call #%d, served by instance %d)".formatted(
                name,
                LocalTime.now(clock).truncatedTo(ChronoUnit.SECONDS),
                calls.incrementAndGet(),
                System.identityHashCode(this));
    }
}

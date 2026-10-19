package com.example.beansdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beansdemo.Service.GreetingService;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor injection: no @Autowired needed when there is a single constructor.
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Soulemane") String name) {
        return greetingService.greet(name);
    }
}

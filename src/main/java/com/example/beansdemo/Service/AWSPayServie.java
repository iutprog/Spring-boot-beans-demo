package com.example.beansdemo.Service;

public class AWSPayServie  implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Implement AWS payment processing logic here
        System.out.println("Processing payment of $" + amount + " through AWS Pay Service.");
    }

}

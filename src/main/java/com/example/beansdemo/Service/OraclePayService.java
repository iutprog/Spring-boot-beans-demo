package com.example.beansdemo.Service;

public class OraclePayService  implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Implement Oracle payment processing logic here
        System.out.println("Processing payment of $" + amount + " through Oracle Pay Service.");
    }

}

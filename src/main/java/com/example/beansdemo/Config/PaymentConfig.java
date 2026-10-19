package com.example.beansdemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beansdemo.Service.AWSPayServie;
import com.example.beansdemo.Service.OraclePayService;
import com.example.beansdemo.Service.PaymentService;

@Configuration("paymentConfig")
public class PaymentConfig {

    @Bean
    public PaymentService oraclePayService() {
        return new OraclePayService();
    }

    @Bean
    public PaymentService awsPayService() {
        return new AWSPayServie();
    }
}

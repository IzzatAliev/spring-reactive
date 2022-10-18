package com.iua;

import com.iua.webclient.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestReactiveApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestReactiveApplication.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        System.out.println(">> message = " + greetingClient.getMessage().block());
    }
}

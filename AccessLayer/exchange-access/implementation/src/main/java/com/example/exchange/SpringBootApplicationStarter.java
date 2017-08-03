package com.example.exchange;

import com.example.exchange.configuration.ExchangeSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Piotr Heilman on 2017-08-03.
 */

@SpringBootApplication
public class SpringBootApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExchangeSpringConfiguration.class, args);
    }
}


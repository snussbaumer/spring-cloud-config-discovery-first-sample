package com.example.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TestApplication.class);

    private final String myProperty;

    public TestApplication(@Value("${my-property:not-the-value-we-want}") String myProperty) {
        this.myProperty = myProperty;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("My property : {}", myProperty);
    }
}

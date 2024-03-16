package com.yatakeke.playwright;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestPlaywrightApplication {

    public static void main(String[] args) {
        SpringApplication.from(PlaywrightApplication::main).with(TestPlaywrightApplication.class).run(args);
    }

}

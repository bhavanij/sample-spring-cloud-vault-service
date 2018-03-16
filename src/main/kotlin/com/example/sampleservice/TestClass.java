package com.example.sampleservice;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    public TestClass() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration");
        Object obj = clazz;
        System.out.println("************ PropertySourceBootstrapConfiguration is Ordered :: " + (obj instanceof Ordered));
    }

}

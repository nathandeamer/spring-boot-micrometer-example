package com.example.demo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DemoService {

    private final Random random = new Random();
    private final MeterRegistry registry;

    public DemoService(MeterRegistry registry) {
        this.registry = registry;
    }

    public String get() throws InterruptedException {
        registry.counter("DEMO_Counter").increment();
        Thread.sleep(random.nextInt(10) * 1000);
        return "Hello World";
    }

}

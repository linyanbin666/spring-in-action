package com.horizon.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Horizon
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello application event");
        context.close();
    }
}

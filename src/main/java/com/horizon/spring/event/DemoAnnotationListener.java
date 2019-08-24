package com.horizon.spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Horizon
 */
@Component("demoAnnotationListener")
public class DemoAnnotationListener {

    @EventListener
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMag();
        System.out.println("bean-demoAnnotationListener接收到了bean-demoPublisher发布的消息：" + msg);
    }
}

package com.horizon.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Horizon
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMag();
        System.out.println("bean-demoListener接收到了bean-demoPublisher发布的消息：" + msg);
    }
}

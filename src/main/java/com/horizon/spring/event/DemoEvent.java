package com.horizon.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件，继承ApplicationEvent
 * Created by Horizon
 */
public class DemoEvent extends ApplicationEvent {

    private String mag;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.mag = msg;
    }

    public String getMag() {
        return mag;
    }

}

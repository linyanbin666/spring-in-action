package com.horizon.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by Horizon
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置获得的Bean");
    }
}

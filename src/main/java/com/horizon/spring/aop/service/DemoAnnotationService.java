package com.horizon.spring.aop.service;

import com.horizon.spring.aop.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by Horizon
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("添加");
    }

}

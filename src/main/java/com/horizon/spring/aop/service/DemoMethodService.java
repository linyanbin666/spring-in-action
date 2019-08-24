package com.horizon.spring.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by Horizon
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("添加");
    }
}

package com.horizon.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Horizon
 */
@Configuration
@ComponentScan(basePackages = "com.horizon.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

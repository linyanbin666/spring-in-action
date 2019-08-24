package com.horizon.spring.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Horizon
 */
@Configuration
@ComponentScan(basePackages = "com.horizon.spring.taskscheduler")
@EnableScheduling   // 开启对计划任务的支持
public class TaskSchedulerConfig {

}

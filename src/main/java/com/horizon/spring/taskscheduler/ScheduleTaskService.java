package com.horizon.spring.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Horizon
 */
@Service
public class ScheduleTaskService {

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)    // fixedRate属性每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 " + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 02 22 ? * *")  // cron属性可在指定时间执行，这里是指定在每天22点02分执行
    public void fixTimeExecutor() {
        System.out.println("在指定时间 " + dataFormat.format(new Date()) + "执行");
    }
}

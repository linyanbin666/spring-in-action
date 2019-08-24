package com.horizon.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Horizon
 */
@Service
public class AsyncService {

    @Async  // 表明该方法是个异步方法，注解可在类级别上，标明该类所有方法都是异步方法
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }
}

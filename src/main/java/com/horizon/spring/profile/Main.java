package com.horizon.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Horizon
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev"); // 将活动的Profile设置为prod
        context.register(ProfileConfig.class); // 注册Bean配置类
        context.refresh();  // 刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}

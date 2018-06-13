package com.buguniao.spring.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 *
 * 自定义监听器,基于spring
 *
 * @author wangwenchang
 * @date 2018/6/13 11:15
 */
@Component
public class CustomListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("------初始化执行监听器----");

        ApplicationContext context = event.getApplicationContext();
        String[] serviceNames = context.getBeanNamesForAnnotation(Service.class);
        String[] controllerNames = context.getBeanNamesForAnnotation(Controller.class);
        System.out.println(0);

    }
}

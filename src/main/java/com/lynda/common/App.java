package com.lynda.common;

import com.lynda.common.domain.Vehicle;
import com.lynda.common.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        OrderService orderService = context.getBean(OrderService.class);

        Vehicle obj = (Vehicle)context.getBean("car");
        obj.drive();

        Vehicle obj1 = (Vehicle)context.getBean("bike");
        obj1.drive();
    }
}

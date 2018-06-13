package com.lynda.common.domain;


import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    //Autowiring

    public void drive() {
        System.out.println("Drive Car....");
    }
}

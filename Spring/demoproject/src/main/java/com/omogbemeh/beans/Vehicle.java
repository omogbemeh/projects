package com.omogbemeh.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle has been created");
    }

    public void setMake(String make) {
        this.make = make;
    }

    private String make = "";

    public String getMake() {
        return make;
    }

    public void sayHello() {
        System.out.println("Bet you didnt know cars could talk.");
    }

    public void check() {
        System.out.println("I'm still here though 👀");
    }

    @Override
    public String toString() {
        return "Vehicle make is " + getMake();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("I am cleaning up!");
    }
}

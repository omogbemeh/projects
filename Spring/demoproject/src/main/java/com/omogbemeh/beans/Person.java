package com.omogbemeh.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public Person() {
        System.out.println("Person has been created");
    }

    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

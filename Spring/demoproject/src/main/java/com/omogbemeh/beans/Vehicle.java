package com.omogbemeh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String make = "";

    private VehicleServices vehicleServices;

    @Autowired
    public Vehicle() {
        System.out.println("Vehicle has been created");
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    @Autowired
    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
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

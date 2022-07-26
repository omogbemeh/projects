package com.omogbemeh.config;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Audi");
        return vehicle;
    }

    @Bean
    Person person() {
        Person person = new Person();
        person.setName("Praise");
        person.setVehicle(vehicle());
        return person;
    }
}

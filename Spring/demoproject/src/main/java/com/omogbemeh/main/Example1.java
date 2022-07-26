package com.omogbemeh.main;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import com.omogbemeh.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName() + "'s " + person.getVehicle());
    }
}

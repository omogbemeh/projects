package com.omogbemeh.main;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import com.omogbemeh.beans.VehicleServices;
import com.omogbemeh.beans.speakers.BoseSpeaker;
import com.omogbemeh.beans.speakers.SonySpeaker;
import com.omogbemeh.beans.speakers.Speaker;
import com.omogbemeh.beans.tyres.BridgeStoneTyre;
import com.omogbemeh.beans.tyres.MichelinTyre;
import com.omogbemeh.beans.tyres.Tyre;
import com.omogbemeh.config.ProjectConfig;
import com.omogbemeh.factory.SpeakerFactory;
import com.omogbemeh.factory.TyreFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean( Vehicle.class);

        vehicle.setMake("Porsche");
        person.setName("Praise");

        Speaker vehicleSpeaker = vehicle.getVehicleServices().getSpeaker();

        System.out.println(person.getName() + "'s " + person.getVehicle() + " and has a " + vehicleSpeaker.getName() + " sound system");
    }
}

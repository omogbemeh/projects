package com.omogbemeh.main;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import com.omogbemeh.beans.speakers.Speaker;
import com.omogbemeh.config.ProjectConfig;
import com.omogbemeh.factory.SpeakerFactory;
import com.omogbemeh.interfaces.SpeakerInterface;
import com.omogbemeh.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vhBean = context.getBean(VehicleServices.class);
        Speaker newBose = SpeakerFactory.createSpeaker("Bose");
        SpeakerInterface bose = (SpeakerInterface) newBose;
        boolean vehicleIsOn = false;
        bose.makeSound();
    }
}

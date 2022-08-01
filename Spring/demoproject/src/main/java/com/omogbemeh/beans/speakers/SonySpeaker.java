package com.omogbemeh.beans.speakers;

import com.omogbemeh.interfaces.SpeakerInterface;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker extends Speaker implements SpeakerInterface {
    public SonySpeaker() {
        super("Sony");
    }

    public void makeSound(boolean vehicleStarted) {
        System.out.println("The sony speakers are playing some hip hop classics.");
    }

}

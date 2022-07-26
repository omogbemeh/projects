package com.omogbemeh.beans.speakers;

import com.omogbemeh.interfaces.SpeakerInterface;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker extends Speaker implements SpeakerInterface {
    public BoseSpeaker() {
        super("Bose");
    }

    public void makeSound() {
        System.out.println("The bose speaker is playing some cool jamz.");
    }
}

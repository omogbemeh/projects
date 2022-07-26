package com.omogbemeh.beans;

import com.omogbemeh.beans.speakers.Speaker;
import com.omogbemeh.beans.tyres.Tyre;
import com.omogbemeh.factory.SpeakerFactory;
import com.omogbemeh.factory.TyreFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private Speaker speaker;
    private Tyre tyre;

    public VehicleServices() {
        System.out.println("Vehicle services was created");
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    @Autowired
    public void setSpeaker(@Qualifier("boseSpeaker") Speaker speaker) {
        this.speaker = speaker;
    }

    @Autowired
    public void setTyre(@Qualifier("bridgeStoneTyre") Tyre tyre) {
        this.tyre = tyre;
    }
}

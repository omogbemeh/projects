package com.omogbemeh.factory;

import com.omogbemeh.beans.speakers.BoseSpeaker;
import com.omogbemeh.beans.speakers.SonySpeaker;
import com.omogbemeh.beans.speakers.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SpeakerFactory {
    public static Speaker createSpeaker(String speakerType) {
        String formattedString = speakerType.strip().toLowerCase();
        if ("bose".equals(formattedString)) return new BoseSpeaker();
        else if ("sony".equals(formattedString)) return new SonySpeaker();
        return null;
    }
}

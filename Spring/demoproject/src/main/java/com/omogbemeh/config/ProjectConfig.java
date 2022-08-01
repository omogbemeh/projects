package com.omogbemeh.config;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import com.omogbemeh.beans.speakers.BoseSpeaker;
import com.omogbemeh.beans.speakers.Speaker;
import com.omogbemeh.beans.tyres.BridgeStoneTyre;
import com.omogbemeh.beans.tyres.Tyre;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.omogbemeh.beans", "com.omogbemeh.services", "com.omogbemeh.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean("boseSpeaker")
    Speaker boseSpeaker() {
        return new BoseSpeaker();
    }
    @Bean("bridgeStoneTyre")
    Tyre bridgeStone() {
        return new BridgeStoneTyre();
    }
}

package com.omogbemeh.config;

import com.omogbemeh.beans.Person;
import com.omogbemeh.beans.Vehicle;
import com.omogbemeh.beans.speakers.BoseSpeaker;
import com.omogbemeh.beans.speakers.Speaker;
import com.omogbemeh.beans.tyres.BridgeStoneTyre;
import com.omogbemeh.beans.tyres.Tyre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.omogbemeh.beans")
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

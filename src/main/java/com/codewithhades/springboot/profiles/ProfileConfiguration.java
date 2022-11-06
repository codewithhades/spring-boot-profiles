package com.codewithhades.springboot.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfiguration {

    @Value("${profile.message}")
    private final String profileMessage;

    public ProfileConfiguration(@Value("${profile.message}") String profileMessage) {
        this.profileMessage = profileMessage;
    }

    public String getProfileMessage() {
        return profileMessage;
    }
}

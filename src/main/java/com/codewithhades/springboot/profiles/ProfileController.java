package com.codewithhades.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    private final ProfileConfiguration profileConfiguration;

    @Autowired
    public ProfileController(ProfileConfiguration profileConfiguration) {
        this.profileConfiguration = profileConfiguration;
    }

    @GetMapping
    public ResponseEntity<String> getProfileMessage() {
        return ResponseEntity.ok(profileConfiguration.getProfileMessage());
    }

}

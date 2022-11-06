package com.codewithhades.springboot.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

@ActiveProfiles("test")
@SpringBootTest
public class ProfileConfigurationTest {

   @Autowired
   private ProfileConfiguration profileConfiguration;

    @Test
    void testProfileShouldBeSet() {
        Assert.isTrue(profileConfiguration.getProfileMessage().equals("Hello from test profile!"),
                "Test profile should be set");
    }

}

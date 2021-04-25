package org.dev.pepo.server;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncodeTest {

    @Test
    void encode() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "pass";
        String encodedPassword = passwordEncoder.encode(password);
        System.out.println();
        System.out.println("Password is         : " + password);
        System.out.println("Encoded Password is : " + encodedPassword);
        System.out.println();

        boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
        Assertions.assertTrue(isPasswordMatch);
    }
}

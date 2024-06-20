package com.lizana.appsegurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AppsegurityApplication implements CommandLineRunner {


    @Autowired
    PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(AppsegurityApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(passwordEncoder.encode("to_be_encoded"));

    }
}

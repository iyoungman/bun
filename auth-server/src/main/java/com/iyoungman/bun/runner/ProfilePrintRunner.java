package com.iyoungman.bun.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by iyoungman on 2020-04-20.
 */

@Component
public class ProfilePrintRunner implements ApplicationRunner {

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${server.port}")
    private String port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============================================");
        System.out.println("profile is " + profile);
        System.out.println("port is " + port);
        System.out.println("==============================================");
    }
}

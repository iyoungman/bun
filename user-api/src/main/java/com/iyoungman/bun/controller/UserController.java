package com.iyoungman.bun.controller;

import com.iyoungman.bun.component.MessageProducer.WriteReviewSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iyoungman on 2020-04-18.
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private WriteReviewSource writeReviewSource;

    @GetMapping
    public String getUser() {
        return "User";
    }

    @DeleteMapping
    public void deleteUser(@RequestHeader(value = "Authorization") String authorization) {
        System.out.println("Authorization : " + authorization);

        writeReviewSource.writeReview().send(MessageBuilder.withPayload("{seq : 13322}").build());
    }
}

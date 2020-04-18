package com.iyoungman.bun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iyoungman on 2020-04-18.
 */

@RestController
public class UserController {

    @GetMapping("/api/user")
    public String getUser() {
        return "User";
    }
}

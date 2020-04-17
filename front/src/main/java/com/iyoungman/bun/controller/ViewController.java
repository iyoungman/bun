package com.iyoungman.bun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iyoungman on 2020-04-16.
 */

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}

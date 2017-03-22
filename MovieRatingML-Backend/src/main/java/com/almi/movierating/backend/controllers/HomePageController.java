package com.almi.movierating.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by c309044 on 2017-03-22.
 */
@RestController
public class HomePageController {

    @GetMapping("/")
    public String getMessage() {
        return "This is test message";
    }


}

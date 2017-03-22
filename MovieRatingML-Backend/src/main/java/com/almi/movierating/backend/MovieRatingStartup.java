package com.almi.movierating.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by c309044 on 2017-03-22.
 */
@SpringBootApplication(scanBasePackages = {"com.almi.movierating.backend.controllers"})
public class MovieRatingStartup {

    public static void main(String[] args) {
        SpringApplication.run(MovieRatingStartup.class, args);
    }

}

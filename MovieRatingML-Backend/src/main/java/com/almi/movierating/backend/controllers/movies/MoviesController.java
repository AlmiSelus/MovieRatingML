package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.MovieData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by c309044 on 2017-03-22.
 *
 * Main movies controller
 */
@RestController("/api/movies")
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/movies")
    public Iterable<MovieData> getIMDBMovieData() {
        return movieRepository.findAll();
    }

}

package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.MovieData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c309044 on 2017-03-22.
 *
 * Main movies controller
 */
@RestController("/api/movies")
public class MoviesController {

    @GetMapping
    public List<MovieData> getIMDBMovieData() {
        List<MovieData> movieData = new ArrayList<>();

        movieData.add(new MovieData.Builder().name("Star Wars I : The Phantom Menace").build());
        movieData.add(new MovieData.Builder().name("Star Wars II : Attack Of The Clones").build());
        movieData.add(new MovieData.Builder().name("Star Wars III : Revenge Of The Sith").build());
        movieData.add(new MovieData.Builder().name("Star Wars IV : A New Hope").build());
        movieData.add(new MovieData.Builder().name("Star Wars V : Empire Strikes Back").build());
        movieData.add(new MovieData.Builder().name("Star Wars VI : Return Of The Jedi").build());
        movieData.add(new MovieData.Builder().name("Star Wars VII : The Force Awakens").build());
        movieData.add(new MovieData.Builder().name("Star Wars VIII : The Last Jedi").build());

        return movieData;
    }

}

package com.almi.movierating.backend;

import com.almi.movierating.backend.beans.MovieData;
import com.almi.movierating.backend.controllers.movies.MovieRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by c309044 on 2017-03-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void testShouldFind8MoviesStartingWithStarWars() {
        List<MovieData> starWarsMovies = movieRepository.findMoviesByNameLike("Star Wars");
        starWarsMovies.stream().map(MovieData::getName).forEach(System.out::println);
        assertEquals(8, starWarsMovies.size());
    }
}

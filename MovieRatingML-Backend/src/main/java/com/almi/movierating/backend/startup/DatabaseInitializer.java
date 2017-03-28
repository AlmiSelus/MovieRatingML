package com.almi.movierating.backend.startup;

import com.almi.movierating.backend.beans.Genre;
import com.almi.movierating.backend.beans.MovieData;
import com.almi.movierating.backend.controllers.movies.GenreRepository;
import com.almi.movierating.backend.controllers.movies.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by c309044 on 2017-03-27.
 */
@Component
public class DatabaseInitializer implements ApplicationRunner {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        genreRepository.save(new Genre.Builder().name("Sci-Fi").build());
        genreRepository.save(new Genre.Builder().name("Action").build());

        MovieData starWarsI     = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars I : The Phantom Menace").build();
        MovieData starWarsII    = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars II : Attack Of The Clones").build();
        MovieData starWarsIII   = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars III : Revenge Of The Sith").build();
        MovieData starWarsIV    = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars IV : A New Hope").build();
        MovieData starWarsV     = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars V : Empire Strikes Back").build();
        MovieData starWarsVI    = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars VI : Return Of The Jedi").build();
        MovieData starWarsVII   = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars VII : The Force Awakens").build();
        MovieData starWarsVIII  = new MovieData.Builder().duration((byte) 120).genres(genreRepository.findByName("Sci-Fi"), genreRepository.findByName("Action")).name("Star Wars VIII : The Last Jedi").build();

        movieRepository.save(Arrays.asList(starWarsI, starWarsII, starWarsIII, starWarsIV, starWarsV, starWarsVI, starWarsVII, starWarsVIII));
    }
}

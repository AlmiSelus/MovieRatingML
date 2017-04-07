package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

/**
 * Created by c309044 on 2017-03-28.
 */
@RestController("/api/genre")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/api/genre")
    public Iterable<Genre> getAllGenreNames() {
        return genreRepository.findAllGenreNames().stream().map(
          genre->{
            genre.count = genreRepository.countForGenre(genre.getGenreName());
            return genre;
          }).collect(Collectors.toList());
    }

    @GetMapping("/api/genre/{genre}")
    public Genre findGenreDetails(@PathVariable("genre") String genre) {
        return genreRepository.findByName(genre);
    }

}

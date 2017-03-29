package com.almi.movierating.backend;

import com.almi.movierating.backend.beans.Genre;
import com.almi.movierating.backend.controllers.movies.GenreRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by c309044 on 2017-03-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GenreRepositoryTest {

    @Autowired
    private GenreRepository genreRepository;

    @Test
    public void findGenreByName() {
        Genre sciFiGenre = genreRepository.findByName("Sci-Fi");
        assertNotNull(sciFiGenre);
    }

    @Test
    public void shouldNotFindGenreByName() {
        Genre documentaryGenre = genreRepository.findByName("Documentary");
        assertNotNull(documentaryGenre);
    }

    @Test
    public void shouldReturnGenreObjects() {
        List<Genre> genres = genreRepository.findAllGenreNames();
        assertNotNull(genres);
        assertEquals(26, genres.size());
    }

}

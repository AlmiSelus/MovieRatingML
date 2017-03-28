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

    @Before
    public void beforeTest() {
        genreRepository.save(new Genre.Builder().name("Romance").build());
    }

    @Test
    public void findGenreByName() {
        Genre sciFiGenre = genreRepository.findByName("Sci-Fi");
        assertNotNull(sciFiGenre);
    }

    @Test
    public void shouldNotFindGenreByName() {
        Genre documentaryGenre = genreRepository.findByName("Documentary");
        assertNull(documentaryGenre);
    }

    @After
    public void afterTest() {
        genreRepository.deleteAll();
    }

}

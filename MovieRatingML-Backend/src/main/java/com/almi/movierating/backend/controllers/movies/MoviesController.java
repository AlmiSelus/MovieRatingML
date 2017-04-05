package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.MovieData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * Created by c309044 on 2017-03-22.
 *
 * Main movies controller
 */
@CrossOrigin(origins = "http://localhost:3000",
  methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS},
  allowedHeaders = {"x-requested-with", "accept", "authorization", "content-type"},
  exposedHeaders = {"access-control-allow-headers", "access-control-allow-methods", "access-control-allow-origin", "access-control-max-age", "X-Frame-Options"})
@RestController("/api/movies")
public class MoviesController {

    private final static int MOVIES_PER_PAGE = 10;

    @Autowired
    private MovieRepository movieRepository;


    @GetMapping("/api/movies")
    public Iterable<MovieData> getIMDBMovieData() {
        return movieRepository.findAll();
    }

    @GetMapping("/api/movies-{pageNumber}")
    public Iterable<MovieData> getPagedMovieData(@PathVariable("pageNumber") int pageNumber) {
        if(pageNumber < 1) {
            pageNumber = 1;
        }

        long pagesCount = maxPagesCount();
        if(pageNumber > pagesCount) {
          pageNumber = (int) pagesCount;
        }

        return movieRepository.findAllPaged(new PageRequest(pageNumber-1, MOVIES_PER_PAGE));
    }

    @GetMapping("/api/movies/pageCount")
    public long getMoviesPageCount() {
        return maxPagesCount();
    }

    public long maxPagesCount() {
        return (long) Math.ceil(movieRepository.countAllMovies()/MOVIES_PER_PAGE);
    }

}

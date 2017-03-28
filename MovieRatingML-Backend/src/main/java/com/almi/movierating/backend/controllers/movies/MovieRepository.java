package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.MovieData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by c309044 on 2017-03-27.
 */
@Repository
public interface MovieRepository extends CrudRepository<MovieData, Long> {

    @Query("select m from MovieData m where :genre IN (select d.genres from MovieData d where d.id = m.id)")
    List<MovieData> findMoviesByGenre(String genre);

    @Query("select m from MovieData m where m.name LIKE CONCAT('%',:partOfMovieTitle,'%')")
    List<MovieData> findMoviesByNameLike(@Param("partOfMovieTitle")String movieTitle);

}

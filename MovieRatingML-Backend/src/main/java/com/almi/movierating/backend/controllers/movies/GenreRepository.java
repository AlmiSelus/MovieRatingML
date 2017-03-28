package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.Genre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by c309044 on 2017-03-27.
 */
@Repository
@Transactional
public interface GenreRepository extends CrudRepository<Genre, Long> {

    @Query("select g from Genre g where g.genreName = :name")
    Genre findByName(@Param("name") String genreName);

}

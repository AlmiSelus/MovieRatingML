package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.UserData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by c309044 on 2017-03-27.
 */
@Repository
public interface UserRepository extends CrudRepository<UserData, Long> {

    @Query("select u from UserData u where u.id = :id")
    UserData findUserById(@Param("id") long id);
}

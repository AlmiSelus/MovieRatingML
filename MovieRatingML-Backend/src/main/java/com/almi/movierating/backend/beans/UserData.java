package com.almi.movierating.backend.beans;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c309044 on 2017-03-27.
 */
@Entity
@Table(name = "user")
public class UserData {

    @Id
    @GeneratedValue
    @Column(name = "user_id", unique = true)
    private long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @OneToMany(targetEntity = MovieData.class)
    private List<MovieData> movies;

    public String getName() {
        return userName;
    }

    public static class Builder {

        private UserData userData = new UserData();

        public Builder name(String userName) {
            userData.userName = userName;
            return this;
        }

        public Builder moviePreferences(MovieData... movies) {
            userData.movies = Arrays.asList(movies);
            return this;
        }

        public Builder id(long id) {
            userData.id = id;
            return this;
        }

        public UserData build() {
            return userData;
        }
    }
}

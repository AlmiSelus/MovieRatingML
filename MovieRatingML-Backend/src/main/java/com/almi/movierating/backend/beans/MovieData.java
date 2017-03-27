package com.almi.movierating.backend.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c309044 on 2017-03-22.
 */
@JsonSerialize
@Entity(name = "movie")
public class MovieData {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private byte duration;

    @Column
    private List<String> genres;

    public String getName() {
        return name;
    }

    public byte getDuration() {
        return duration;
    }

    public static class Builder {

        private transient MovieData movieData = new MovieData();

        public Builder id(long id) {
            movieData.id = id;
            return this;
        }

        public Builder name(String name) {
            movieData.name = name;
            return this;
        }

        public Builder duration(byte duration) {
            movieData.duration = duration;
            return this;
        }

        public Builder genres(String... genres) {
            if(movieData.genres == null) {
                movieData.genres = new ArrayList<>();
            }

            movieData.genres.addAll(Arrays.asList(genres));
            return this;
        }

        public MovieData build() {
            return movieData;
        }
    }
}

package com.almi.movierating.backend.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c309044 on 2017-03-22.
 */
@JsonSerialize
@Entity
@Table(name = "movie")
public class MovieData {

    @Id
    @GeneratedValue
    @Column(name = "movie_id", unique = true, nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column
    private byte duration;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "genre_movie",
            joinColumns =        { @JoinColumn(name = "movie_id")},
            inverseJoinColumns = { @JoinColumn(name = "genre_id")}
    )
    private List<Genre> genres;

    public String getName() {
        return name;
    }

    public byte getDuration() {
        return duration;
    }

    public List<Genre> getGenres() {
        return genres;
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

        public Builder genres(Genre... genres) {
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

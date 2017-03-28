package com.almi.movierating.backend.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties("movies")
    private List<Genre> genres;

    @Column
    private String director_name;

    private double num_critic_for_reviews;
    private int director_facebook_likes;
    private int actor_3_facebook_likes;
    private String actor_2_name;
    private int actor_1_facebook_likes;
    private double gross;
    private String actor_1_name;
    private String num_voted_users;
    private String cast_total_facebook_likes;
    private String actor_3_name;
    private String facenumber_in_poster;
    private String plot_keywords;
    private String movie_imdb_link;
    private String num_user_for_reviews;
    private String language;
    private String country;
    private String content_rating;
    private double budget;
    private String title_year;
    private String actor_2_facebook_likes;
    private double imdb_score;
    private double aspect_ratio;
    private String movie_facebook_likes;

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

package com.almi.movierating.backend.beans;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by c309044 on 2017-03-27.
 */
@Entity
@Table(name = "category")
public class Genre {

    @Id
    @GenericGenerator(strategy = "increment", name = "genre_generator")
    @GeneratedValue(generator = "genre_generator")
    @Column(name = "category_id", unique = true, nullable = false)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String genreName;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name = "genre_movie", joinColumns = @JoinColumn(name="genre_id"), inverseJoinColumns = @JoinColumn(name = "movie_id"))
    @JsonIgnoreProperties("genres")
    private List<MovieData> movies;

    @JsonIgnore
    public long getId() {
        return id;
    }

    @JsonProperty("name")
    public String getGenreName() {
        return genreName;
    }

    public List<MovieData> getMovies() {
        return movies;
    }

    public static class Builder {
        private Genre genre = new Genre();

        public Builder name(String name) {
            genre.genreName = name;
            return this;
        }

        public Genre build() {
            return genre;
        }
    }
}

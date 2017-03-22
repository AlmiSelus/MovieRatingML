package com.almi.movierating;

/**
 * Created by c309044 on 2017-03-22.
 */
public class MovieData {

    private String name;

    public String getName() {
        return name;
    }

    public static class Builder {

        private transient MovieData movieData = new MovieData();

        public Builder name(String name) {
            movieData.name = name;
            return this;
        }

        public MovieData build() {
            return movieData;
        }
    }
}

package com.almi.movierating;

/**
 * Created by c309044 on 2017-03-22.
 */
public class MovieData {

    private String name;
    private byte duration;

    public String getName() {
        return name;
    }

    public byte getDuration() {
        return duration;
    }

    public static class Builder {

        private transient MovieData movieData = new MovieData();

        public Builder name(String name) {
            movieData.name = name;
            return this;
        }

        public Builder duration(byte duration) {
            movieData.duration = duration;
            return this;
        }

        public MovieData build() {
            return movieData;
        }
    }
}

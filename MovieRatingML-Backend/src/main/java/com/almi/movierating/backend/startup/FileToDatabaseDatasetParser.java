package com.almi.movierating.backend.startup;

import com.almi.movierating.DatasetParser;
import com.almi.movierating.Datasource;
import com.almi.movierating.backend.beans.Genre;
import com.almi.movierating.backend.beans.MovieData;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by c309044 on 2017-03-29.
 */
public class FileToDatabaseDatasetParser implements DatasetParser<List<String>, Pair<List<MovieData>, List<Genre>>> {

    private final static Logger log = LoggerFactory.getLogger(FileToDatabaseDatasetParser.class);

    @Override
    public Pair<List<MovieData>, List<Genre>> parseDataSource(Datasource<List<String>> datasource) {
    return new Pair<List<MovieData>, List<Genre>>() {
            @Override
            public List<MovieData> getLeft() {
                return datasource.getDataSource().stream().skip(1).map(FileToDatabaseDatasetParser::mapRowToMovieData).collect(Collectors.toList());
            }

            @Override
            public List<Genre> getRight() {
                return datasource.getDataSource().stream().skip(1).flatMap(line->Arrays.stream(line.split(",")[9].split("\\|")).map(g -> new Genre.Builder().name(g).build())).distinct().collect(Collectors.toList());
            }

            @Override
            public List<Genre> setValue(List<Genre> value) {
                return null;
            }
        };
    }

    private static MovieData mapRowToMovieData(String movieDataRow) {
        String[] rowSplit = movieDataRow.split(",");
        return new MovieData.Builder().name(rowSplit[11])
                                      .duration(!rowSplit[3].trim().isEmpty() ? Short.parseShort(rowSplit[3]) : -1)
                                      .genre(Arrays.stream(
                                              rowSplit[9].split("\\|")).map(genre -> new Genre.Builder()
                                                                                              .name(genre)
                                                                                              .build())
                                                                       .collect(Collectors.toList()))
                                      .build();
    }

}

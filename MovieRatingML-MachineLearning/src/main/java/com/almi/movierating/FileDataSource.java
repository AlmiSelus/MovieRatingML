package com.almi.movierating;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by c309044 on 2017-03-29.
 */
public class FileDataSource implements Datasource<List<String>> {

    private String filePath;
    private final static Logger log = LoggerFactory.getLogger(FileDataSource.class);

    public FileDataSource(String path) {
        this.filePath = path;
    }

    @Override
    public List<String> getDataSource() {
        try(Stream<String> stream = Files.lines(Paths.get(getClass().getResource(filePath).toURI()))) {
            return stream.collect(Collectors.toList());
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
        }

        return new ArrayList<>();
    }

}

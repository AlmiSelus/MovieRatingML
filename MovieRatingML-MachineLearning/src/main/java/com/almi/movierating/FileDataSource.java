package com.almi.movierating;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        try(BufferedReader fileReader = new BufferedReader(new InputStreamReader(new ClassPathResource(filePath).getInputStream()))){
            return fileReader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
        }

        return new ArrayList<>();
    }

}

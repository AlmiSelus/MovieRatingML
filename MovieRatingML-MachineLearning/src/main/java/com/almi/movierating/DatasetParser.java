package com.almi.movierating;

/**
 * Created by c309044 on 2017-03-22.
 */
public interface DatasetParser<T, R> {

    R parseDataSource(Datasource<T> datasource);

}

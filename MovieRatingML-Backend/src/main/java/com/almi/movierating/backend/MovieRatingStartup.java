package com.almi.movierating.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.sql.DataSource;

/**
 * Created by c309044 on 2017-03-22.
 */
@SpringBootApplication(scanBasePackages = {"com.almi.movierating.backend"})
@EnableJpaRepositories(basePackages = {"com.almi.movierating.backend"})
public class MovieRatingStartup {

    public static void main(String[] args) {
        SpringApplication.run(MovieRatingStartup.class, args);
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:h2:mem:moviedb:H2")
                .driverClassName("org.h2.Driver")
                .username("sa")
                .password("")
                .build();
    }

    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        HibernateJpaSessionFactoryBean factoryBean = new HibernateJpaSessionFactoryBean();
        factoryBean.getJpaPropertyMap().put("show_sql", "true");
        return factoryBean;
    }

}

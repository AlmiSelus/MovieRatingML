package com.almi.movierating.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;

import javax.sql.DataSource;

/**
 * Created by c309044 on 2017-03-22.
 *
 * Temporarily exclude security config
 */
@SpringBootApplication(scanBasePackages = {"com.almi.movierating.backend"}, exclude = {SecurityAutoConfiguration.class})
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

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**").allowedOrigins("http://localhost:3000")
                .allowedHeaders("x-requested-with", "accept", "authorization", "content-type")
                .exposedHeaders("access-control-allow-headers", "access-control-allow-methods", "access-control-allow-origin", "access-control-max-age", "X-Frame-Options")
                .allowedMethods(RequestMethod.OPTIONS.name(), RequestMethod.GET.name(), RequestMethod.POST.name());
            }
        };
    }

}

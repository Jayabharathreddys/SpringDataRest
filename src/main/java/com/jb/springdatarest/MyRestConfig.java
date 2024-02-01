package com.jb.springdatarest;

import com.jb.springdatarest.entity.Book;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.HttpMethods;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyRestConfig implements RepositoryRestConfigurer {

    HttpMethod[] unSupportedHttpMethods = {HttpMethod.PUT, HttpMethod.DELETE};

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
                                                     CorsRegistry cors) {
        //RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        config.getExposureConfiguration()
                .forDomainType(Book.class)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unSupportedHttpMethods))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unSupportedHttpMethods));

    }
}

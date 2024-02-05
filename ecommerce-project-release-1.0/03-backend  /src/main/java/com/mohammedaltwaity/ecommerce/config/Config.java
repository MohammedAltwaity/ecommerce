package com.mohammedaltwaity.ecommerce.config;

import com.mohammedaltwaity.ecommerce.entity.Product;
import com.mohammedaltwaity.ecommerce.entity.ProductCategory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class Config implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};

        // disable HTTP methods for Product: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metaData, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metaData, httpMethods) -> httpMethods.disable(theUnsupportedActions));

        // disable HTTP methods for ProductCategory: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metaData, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metaData, httpMethods) -> httpMethods.disable(theUnsupportedActions));

    }
}

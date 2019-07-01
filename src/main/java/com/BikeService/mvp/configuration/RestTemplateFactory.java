package com.BikeService.mvp.configuration;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateFactory implements FactoryBean<RestTemplate> {

    @Override
    public RestTemplate getObject() {
        return new RestTemplateBuilder()
                .build();
    }

    @Override
    public Class<?> getObjectType() {
        return RestTemplate.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}

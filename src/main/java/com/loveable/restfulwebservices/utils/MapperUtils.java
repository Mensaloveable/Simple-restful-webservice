package com.loveable.restfulwebservices.utils;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperUtils {
    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}

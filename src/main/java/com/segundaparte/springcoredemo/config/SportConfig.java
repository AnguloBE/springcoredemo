package com.segundaparte.springcoredemo.config;

import com.segundaparte.springcoredemo.common.Coach;
import com.segundaparte.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}

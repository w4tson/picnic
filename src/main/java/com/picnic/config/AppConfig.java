package com.picnic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.picnic.service.PicnicService;

@Configuration
public class AppConfig {

    @Bean
    public PicnicService service() {
        return new PicnicService();
    }

}
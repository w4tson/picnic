package com.picnic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.picnic.controller.MainController;
import com.picnic.service.PicnicService;

@Configuration
public class AppConfig {

    @Bean
    public PicnicService service() {
        return new PicnicService();
    }

    @Bean
    @Scope("prototype")
    public MainController mainController() {
        return new MainController();
    }
}
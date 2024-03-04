package ru.dzmakats.springmvcdemoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Created by Denis Zolotarev on 04.03.2024
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean("getJsonIngr")
    public MappingJackson2JsonView jackson2JsonView() {
        return new MappingJackson2JsonView();
    }
}

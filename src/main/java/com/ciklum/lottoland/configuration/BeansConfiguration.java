package com.ciklum.lottoland.configuration;

import com.ciklum.lottoland.dtos.Stats;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public Stats gameStats() {

        return new Stats();
    }
}

package com.jishnu.bookstore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BookUrlConfig
{
    @Bean
    public WebClient bookAPIClient()
    {
        return WebClient.create("https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json");
    }
}

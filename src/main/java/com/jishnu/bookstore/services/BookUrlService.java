package com.jishnu.bookstore.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jishnu.bookstore.objects.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookUrlService
{
    public WebClient webClient;

    public BookUrlService(WebClient webClient)
    {
        this.webClient = webClient;
    }

    public List<Book> getBooks()
    {
        Flux<String> response = webClient.get()
                .retrieve()
                .bodyToFlux(String.class);

        StringBuilder sb = new StringBuilder();
        response.collectList().block().forEach(sb::append);

        ObjectMapper mapper = new ObjectMapper();
        List<Book> books = new ArrayList<>();

        try
        {
            books = mapper.readValue(sb.toString(), new TypeReference<List<Book>>() {});
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }

        return books;
    }
}

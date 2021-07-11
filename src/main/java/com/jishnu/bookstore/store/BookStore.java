package com.jishnu.bookstore.store;

import com.jishnu.bookstore.objects.Book;
import com.jishnu.bookstore.services.BookUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BookStore
{
    @Autowired
    BookUrlService bookUrlService;

    private List<Book> books;

    public void initializeBookStore()
    {
        //invoke book service.
        //Persist book information in books list.
        books = bookUrlService.getBooks();
    }

    @Bean
    public List<Book> getBookStore()
    {
        if(books == null)
            initializeBookStore();

        return books;
    }
}

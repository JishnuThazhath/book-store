package com.jishnu.bookstore.services;

import com.jishnu.bookstore.objects.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllBooksService
{
    @Autowired
    List<Book> books;

    public List<Book> getAllBooks()
    {
        return books;
    }
}

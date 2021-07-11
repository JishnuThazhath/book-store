package com.jishnu.bookstore.services;

import com.jishnu.bookstore.objects.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookByIdService implements BookFinder<Book>
{
    private Map<String, Book> booksMap = new HashMap<>();

    public BookByIdService(List<Book> books)
    {
        books.stream().forEach(book -> booksMap.put(book.getId(), book));
    }

    @Override
    public Book find(String key) {
        return booksMap.get(key);
    }
}

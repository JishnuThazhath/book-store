package com.jishnu.bookstore.services;

import com.jishnu.bookstore.objects.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BookByTitleSearchService implements BookFinder<List<Book>>
{
    private Map<String, Book> booksByTitleMap = new HashMap<>();

    public BookByTitleSearchService(List<Book> books)
    {
        books.stream().forEach(book -> booksByTitleMap.put(book.getTitle(), book));
    }

    @Override
    public List<Book> find(String key)
    {
        return booksByTitleMap.keySet()
                .stream()
                .filter(item -> item.contains(key))
                .map(item -> booksByTitleMap.get(item))
                .collect(Collectors.toList());
    }
}

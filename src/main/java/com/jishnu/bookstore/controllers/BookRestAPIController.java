package com.jishnu.bookstore.controllers;

import com.jishnu.bookstore.objects.Book;
import com.jishnu.bookstore.services.AllBooksService;
import com.jishnu.bookstore.services.BookByIdService;
import com.jishnu.bookstore.services.BookByTitleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestAPIController
{
    @Autowired
    private BookByIdService bookByIdService;

    @Autowired
    private AllBooksService allBooksService;

    @Autowired
    private BookByTitleSearchService bookByTitleSearchService;

    @GetMapping("/verify")
    public String verify()
    {
        return "It Works!";
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable String bookId)
    {
        return ResponseEntity.ok().body(bookByIdService.find(bookId));
    }

    @GetMapping("/")
    public ResponseEntity<List<Book>> getAllBooks()
    {
        return ResponseEntity.ok().body(allBooksService.getAllBooks());
    }

    @GetMapping("/search/{key}")
    public ResponseEntity<List<Book>> getBookByTitleSearch(@PathVariable String key)
    {
        return ResponseEntity.ok().body(bookByTitleSearchService.find(key));
    }
}

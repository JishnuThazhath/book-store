package com.jishnu.bookstore;

import com.jishnu.bookstore.store.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jishnu.bookstore")
public class BookStoreApplication
{
	@Autowired
	private BookStore bookStore;

	public static void main(String[] args)
	{
		SpringApplication.run(BookStoreApplication.class, args);
	}
}

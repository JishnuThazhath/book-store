package com.jishnu.bookstore.services;

public interface BookFinder<T>
{
    public T find(String key);
}

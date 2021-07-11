package com.jishnu.bookstore.objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Book
{
    private String id;
    private String title;
    private String authors;
    private String averageRating;
    private String isbn;
    private String languageCode;
    private String ratingsCount;
    private String price;

    public String getId()
    {
        return id;
    }

    @JsonSetter("bookID")
    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    @JsonSetter("title")
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthors()
    {
        return authors;
    }

    @JsonSetter("authors")
    public void setAuthors(String authors)
    {
        this.authors = authors;
    }

    public String getAverageRating()
    {
        return averageRating;
    }

    @JsonSetter("average_rating")
    public void setAverageRating(String averageRating)
    {
        this.averageRating = averageRating;
    }

    public String getIsbn()
    {
        return isbn;
    }

    @JsonSetter("isbn")
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getLanguageCode()
    {
        return languageCode;
    }

    @JsonSetter("language_code")
    public void setLanguageCode(String languageCode)
    {
        this.languageCode = languageCode;
    }

    public String getRatingsCount()
    {
        return ratingsCount;
    }

    @JsonSetter("ratings_count")
    public void setRatingsCount(String ratingsCount)
    {
        this.ratingsCount = ratingsCount;
    }

    public String getPrice()
    {
        return price;
    }

    @JsonSetter("price")
    public void setPrice(String price)
    {
        this.price = price;
    }
}

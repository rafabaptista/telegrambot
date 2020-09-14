package io.bot.telegrambot.model;

import org.springframework.lang.NonNull;

public class Book {
    private String id;
    private String title;
    private String description;
    private String isbn13;
    private String isbn10;
    private String imageUrl;
    private String author;
    private String publisher;
    private String publishDate;

    public Book() { }

    public String getId() {
        return id;
    }

    @NonNull
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    @NonNull
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    @NonNull
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn13() {
        return isbn13;
    }

    @NonNull
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    @NonNull
    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @NonNull
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAuthor() {
        return author;
    }

    @NonNull
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    @NonNull
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @NonNull
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}

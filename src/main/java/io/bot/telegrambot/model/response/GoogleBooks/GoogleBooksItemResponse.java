package io.bot.telegrambot.model.response.GoogleBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleBooksItemResponse {
    private @JsonProperty("id") String id;
    private @JsonProperty("volumeInfo")
    GoogleBooksVolumeInfoResponse book;

    public GoogleBooksItemResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GoogleBooksVolumeInfoResponse getBook() {
        return book;
    }

    public void setBook(GoogleBooksVolumeInfoResponse book) {
        this.book = book;
    }
}

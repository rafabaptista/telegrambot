package io.bot.telegrambot.model.response.GoogleBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleBooksImageLinkResponse {
    private @JsonProperty("smallThumbnail") String smallThumbnail;
    private @JsonProperty("thumbnail") String thumbnail;

    public GoogleBooksImageLinkResponse() {
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}

package io.bot.telegrambot.model.response.GoogleBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleBooksIndustryIdentifierResponse {
    private @JsonProperty("type") String type;
    private @JsonProperty("identifier") String identifier;

    public GoogleBooksIndustryIdentifierResponse() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

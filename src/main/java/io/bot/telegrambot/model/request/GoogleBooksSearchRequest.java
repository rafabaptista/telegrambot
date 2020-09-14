package io.bot.telegrambot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import static io.bot.telegrambot.configuration.constant.ValueConstant.*;

public class GoogleBooksSearchRequest {
    private @JsonProperty("q") String query;
    private @JsonProperty("maxResults") int maxResults;
    private @JsonProperty("langRestrict") String langRestrict;
    private @JsonProperty("orderBy") String orderBy;
    private @JsonProperty("printType") String printType;

    public GoogleBooksSearchRequest(String query) {
        this.query = query;
        this.langRestrict = VALUE_LANGUAGE_RESTRICT_PORTUGUESE;
        this.maxResults = 1;
        this.orderBy = VALUE_ORDER_BY_NEWEST;
        this.printType = VALUE_PRINT_TYPE_BOOKS;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public String getLangRestrict() {
        return langRestrict;
    }

    public void setLangRestrict(String langRestrict) {
        this.langRestrict = langRestrict;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }
}

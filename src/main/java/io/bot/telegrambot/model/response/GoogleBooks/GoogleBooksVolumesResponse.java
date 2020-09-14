package io.bot.telegrambot.model.response.GoogleBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class GoogleBooksVolumesResponse {
    private @JsonProperty("totalItems") int totalItems;
    private @JsonProperty("items") ArrayList<GoogleBooksItemResponse> itemList;

    public GoogleBooksVolumesResponse() { }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public ArrayList<GoogleBooksItemResponse> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<GoogleBooksItemResponse> itemList) {
        this.itemList = itemList;
    }
}

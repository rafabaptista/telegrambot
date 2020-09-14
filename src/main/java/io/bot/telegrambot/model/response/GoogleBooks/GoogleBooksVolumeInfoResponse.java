package io.bot.telegrambot.model.response.GoogleBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class GoogleBooksVolumeInfoResponse {
    private @JsonProperty("title") String title;
    private @JsonProperty("publisher") String publisher;
    private @JsonProperty("publishedDate") String publishedDate;
    private @JsonProperty("description") String description;
    private @JsonProperty("authors") ArrayList<String> authorList;
    private @JsonProperty("industryIdentifiers") ArrayList<GoogleBooksIndustryIdentifierResponse> isbnList;
    private @JsonProperty("pageCount") int pageCount;
    private @JsonProperty("imageLinks") GoogleBooksImageLinkResponse imageLink;

    public GoogleBooksVolumeInfoResponse() { }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<String> authorList) {
        this.authorList = authorList;
    }

    public ArrayList<GoogleBooksIndustryIdentifierResponse> getIsbnList() {
        return isbnList;
    }

    public void setIsbnList(ArrayList<GoogleBooksIndustryIdentifierResponse> isbnList) {
        this.isbnList = isbnList;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public GoogleBooksImageLinkResponse getImageLink() {
        return imageLink;
    }

    public void setImageLink(GoogleBooksImageLinkResponse imageLink) {
        this.imageLink = imageLink;
    }
}

package io.bot.telegrambot.model.mapper;

import io.bot.telegrambot.model.Book;
import io.bot.telegrambot.model.response.GoogleBooks.GoogleBooksItemResponse;
import io.bot.telegrambot.model.response.GoogleBooks.GoogleBooksVolumeInfoResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.bot.telegrambot.configuration.constant.ValueConstant.VALUE_TYPE_ISBN_10;
import static io.bot.telegrambot.configuration.constant.ValueConstant.VALUE_TYPE_ISBN_13;

public class BookMapper {
    public static Book map(GoogleBooksItemResponse response) {
        Book book = new Book();
        book.setId((response.getId() != null) ? response.getId() : "");
        book.setTitle((response.getBook() != null) ? mapTitle(response.getBook()) : "");
        book.setDescription((response.getBook() != null) ? mapDescription(response.getBook()) : "");
        book.setAuthor((response.getBook() != null) ? mapAuthor(response.getBook()) : "");
        book.setImageUrl((response.getBook() != null) ? mapImageUrl(response.getBook()) : "");
        book.setIsbn10((response.getBook() != null) ? mapIsbn10(response.getBook()) : "");
        book.setIsbn13((response.getBook() != null) ? mapIsbn13(response.getBook()) : "");
        book.setPublisher((response.getBook() != null) ? mapPublisher(response.getBook()) : "");
        book.setPublishDate((response.getBook() != null) ? mapPublishDate(response.getBook()) : "");
        return book;
    }

    private static String mapPublishDate(GoogleBooksVolumeInfoResponse book) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newFormatDate = new SimpleDateFormat("dd/MM/yyyy");
        String publishDateText = "";
        if (book.getPublishedDate() != null) {
            try {
                Date datePublish = formatDate.parse(book.getPublishedDate());
                publishDateText = newFormatDate.format(datePublish);
            } catch (ParseException e) {
                e.printStackTrace();
                publishDateText = book.getPublishedDate();
            }
        }
        return publishDateText;
    }

    private static String mapPublisher(GoogleBooksVolumeInfoResponse book) {
        return (book.getPublisher() != null) ? book.getPublisher() : "";
    }

    private static String mapIsbn10(GoogleBooksVolumeInfoResponse book) {
        String isbn10 = "";
        if (book.getIsbnList() != null) {
            for (int position = 0; position < book.getIsbnList().size(); position++) {
                var currentIsbn = book.getIsbnList().get(position);
                if (currentIsbn.getType() != null) {
                    if (currentIsbn.getType().equals(VALUE_TYPE_ISBN_10)) {
                        isbn10 = (currentIsbn.getIdentifier() != null) ? currentIsbn.getIdentifier() : "";
                        break;
                    }
                }
            }
        }
        return isbn10;
    }

    private static String mapIsbn13(GoogleBooksVolumeInfoResponse bookResponse) {
        String isbn13 = "";
        if (bookResponse.getIsbnList() != null) {
            for (int position = 0; position < bookResponse.getIsbnList().size(); position++) {
                var currentIsbn = bookResponse.getIsbnList().get(position);
                if (currentIsbn.getType() != null) {
                    if (currentIsbn.getType().equals(VALUE_TYPE_ISBN_13)) {
                        var currentIsbnIdentifier = currentIsbn.getIdentifier();
                        isbn13 = (currentIsbnIdentifier != null) ? formatIsbn13(currentIsbnIdentifier) : "";
                        break;
                    }
                }
            }
        }
        return isbn13;
    }

    private static String formatIsbn13(String currentIsbnIdentifier) {
        return String.format("%s-%s-%s-%s",
                currentIsbnIdentifier.charAt(0),
                currentIsbnIdentifier.substring(1, 1 + 3),
                currentIsbnIdentifier.substring(4, 4 + 5),
                currentIsbnIdentifier.charAt(9));
    }

    private static String mapImageUrl(GoogleBooksVolumeInfoResponse book) {
        String imageUrl = "";
        if(book.getImageLink() != null) {
            imageUrl = (book.getImageLink().getThumbnail() != null) ? book.getImageLink().getThumbnail() + "&fife=w600-h800" : "";
        }
        return imageUrl;
    }

    private static String mapTitle(GoogleBooksVolumeInfoResponse book) {
        return (book.getTitle() != null) ? book.getTitle() : "";
    }

    private static String mapDescription(GoogleBooksVolumeInfoResponse book) {
        return (book.getDescription() != null) ? book.getDescription() : "";
    }

    private static String mapAuthor(GoogleBooksVolumeInfoResponse book) {
        StringBuilder author = new StringBuilder();
        if (book.getAuthorList() != null) {
            for (int position = 0; position < book.getAuthorList().size(); position++) {
                if (position != 0) {
                    author.append(", ");
                }
                author.append(book.getAuthorList().get(position));
            }
        }
        return author.toString();
    }
}

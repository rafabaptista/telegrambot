package io.bot.telegrambot.model.service.handler;

import io.bot.telegrambot.model.Book;
import io.bot.telegrambot.model.Update;
import io.bot.telegrambot.model.mapper.BookMapper;
import io.bot.telegrambot.model.request.GoogleBooksSearchRequest;
import io.bot.telegrambot.model.request.TelegramMessagePhotoRequest;
import io.bot.telegrambot.model.request.TelegramMessageTextRequest;
import io.bot.telegrambot.model.request.TelegramMessageVideoRequest;
import io.bot.telegrambot.model.response.GoogleBooks.GoogleBooksVolumesResponse;
import io.bot.telegrambot.model.service.api.GoogleBooksApi;
import io.bot.telegrambot.model.service.api.TelegramApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static io.bot.telegrambot.configuration.constant.CommandConstant.*;
import static io.bot.telegrambot.configuration.constant.MessageConstant.*;
import static io.bot.telegrambot.configuration.constant.UrlConstant.BOT_API_BASE_IMAGES_URL;


@Service
public class MessageHandler {

    @Autowired(required = false)
    private TelegramApi telegramApi;

    @Autowired(required = false)
    private GoogleBooksApi googleBooksApi;

    public void handle(Update telegramUpdate) {
        var chatId = telegramUpdate.getMessage().getChat().getId();
        var fullName = telegramUpdate.getMessage().getUser().getFirstName() + " " +  telegramUpdate.getMessage().getUser().getLastName();
        var message = telegramUpdate.getMessage().getText().toLowerCase();
        if (message.startsWith("/")) {
            handleCommand(chatId, fullName, message);
        } else {
            handleOthers(chatId, fullName, message);
        }
    }

    private void handleCommand(long chatId, String fullName, String message) {
        if (message.contains(COMMAND_HELP)) {
            sendMessageText(chatId, String.format(HELP_SHOW_COMMANDS, fullName));
        } else if (message.contains(COMMAND_SEARCH_BOOK)) {
            searchBook(chatId, fullName, message);
        } else if (message.equals(COMMAND_EASTER_EGG_LIST)) {
            sendMessageText(chatId, String.format(EASTER_EGG_SHOW_COMMANDS, fullName));
        }
    }

    private void handleOthers(long chatId, String fullName, String message) {
        if (!message.equals(EASTER_EGG_CTHULHU_AWAKE) && !message.contains(COMMAND_HELP_EXCEPTION) && !message.contains("/")
                && (message.equals(EASTER_EGG_HELLO_WORLD) || message.contains(WORLD_CTHULHU))) {
            sendCthulhuGif(chatId);
        } else if (message.equals(EASTER_EGG_CTHULHU_AWAKE)) {
            sendCthulhuGif(chatId);
            sendMessageText(chatId, CTHULHU_AWAKEN);
        } else if (message.contains(BOT_NAME)) {
            if (message.contains(QUESTION_IS_GOING_TO_RAIN)) {
                sendInternalPhoto(chatId, fullName, "rain_today.jpg", ANSWER_IS_GOING_TO_RAIN);
            } else if(message.contains(QUESTION_WHERE_TO_GO)) {
                sendInternalPhoto(chatId, fullName, "sk_wheretogo.jpg", ANSWER_WHERE_TO_GO);
            } else if(message.contains(QUESTION_STEPHEN_KING)) {
                sendInternalPhoto(chatId, fullName, "sk_works.jpg", ANSWER_STEPHEN_KING);
            } else {
                if (!message.contains("/")) {
                    sendMessageText(chatId, String.format(ANSWER_BOTCRAFT_MENTION, fullName));
                }
            }
        }
    }

    private void searchBook(long chatId, String fullName, String message) {
        String searchText = message.replace(COMMAND_SEARCH_BOOK, "").replace("-", "");
        if (!searchText.isBlank() && !searchText.isEmpty() && !searchText.equals(" ")) {
            try {
                GoogleBooksVolumesResponse response = googleBooksApi.searchBook(new GoogleBooksSearchRequest(searchText));
                if (response != null && response.getItemList() != null && response.getItemList().size() > 0) {
                    StringBuilder bookMessage = new StringBuilder();
                    Book book = BookMapper.map(response.getItemList().get(0));
                    bookMessage.append(String.format(TITLE_BOOK, book.getTitle()));
                    bookMessage.append(String.format(AUTHOR_BOOK, book.getAuthor()));
                    bookMessage.append(String.format(PUBLISHER_BOOK, book.getPublisher()));
                    bookMessage.append(String.format(PUBLISH_DATE_BOOK, book.getPublishDate()));
                    bookMessage.append(String.format(ISBN13_BOOK, book.getIsbn13()));
                    bookMessage.append(String.format(ISBN10_BOOK, book.getIsbn10()));
                    sendMessageText(chatId, String.format(ANSWER_BOOK_FOUND, fullName));
                    sendPhoto(chatId, book.getImageUrl(), bookMessage.toString());
                    sendMessageText(chatId, String.format(DESCRIPTION_BOOK, book.getDescription()));
                } else {
                    sendMessageText(chatId, String.format(ANSWER_NO_BOOK_FOUND, fullName));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                sendMessageText(chatId, String.format(ANSWER_ERROR_SEARCH_BOOK, fullName));
            }
        } else {
            sendMessageText(chatId, String.format(ANSWER_EMPTY_SEARCH, fullName));
        }
    }

    private void sendMessageText(long chatId, String cthulhuAwaken) {
        telegramApi.sendMessageText(new TelegramMessageTextRequest(chatId, cthulhuAwaken));
    }

    private void sendInternalPhoto(long chatId, String fullName, String fileName, String messageText) {
        sendPhoto(chatId, String.format("%s%s", BOT_API_BASE_IMAGES_URL, fileName), String.format(messageText, fullName));
    }

    private void sendPhoto(long chatId, String imageUrl, String messageText) {
        telegramApi.sendMessagePhoto(new TelegramMessagePhotoRequest(chatId, imageUrl, messageText));
    }

    private void sendCthulhuGif(long chatId) {
        telegramApi.sendMessageVideo(
                new TelegramMessageVideoRequest(
                        chatId,
                        String.format("%s%s", BOT_API_BASE_IMAGES_URL, "cthulhu.gif.mp4")
                )
        );
    }
}

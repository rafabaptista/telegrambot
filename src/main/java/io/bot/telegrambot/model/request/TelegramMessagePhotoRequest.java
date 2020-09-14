package io.bot.telegrambot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import static io.bot.telegrambot.configuration.constant.ValueConstant.VALUE_PARSE_MODE_MARKDOWN;

public class TelegramMessagePhotoRequest {
    private @JsonProperty("chat_id") long chatId;
    private @JsonProperty("photo") String photo;
    private @JsonProperty("caption") String caption;
    private @JsonProperty("parse_mode") String parseMode;


    public TelegramMessagePhotoRequest(long chatId, String photo, String caption) {
        this.chatId = chatId;
        this.photo = photo;
        this.caption = caption;
        this.parseMode = VALUE_PARSE_MODE_MARKDOWN;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }
}

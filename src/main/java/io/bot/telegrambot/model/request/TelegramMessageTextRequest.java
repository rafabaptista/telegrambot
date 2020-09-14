package io.bot.telegrambot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import static io.bot.telegrambot.configuration.constant.ValueConstant.VALUE_PARSE_MODE_MARKDOWN;

public class TelegramMessageTextRequest {
    private @JsonProperty("chat_id") long chatId;
    private @JsonProperty("text") String text;
    private @JsonProperty("parse_mode") String parseMode;

    public TelegramMessageTextRequest(long chatId, String text) {
        this.chatId = chatId;
        this.text = text;
        this.parseMode = VALUE_PARSE_MODE_MARKDOWN;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }
}

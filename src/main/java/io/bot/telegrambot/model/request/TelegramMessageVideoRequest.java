package io.bot.telegrambot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TelegramMessageVideoRequest {
    private @JsonProperty("chat_id") long chatId;
    private @JsonProperty("video") String video;

    public TelegramMessageVideoRequest(long chatId, String video) {
        this.chatId = chatId;
        this.video = video;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}

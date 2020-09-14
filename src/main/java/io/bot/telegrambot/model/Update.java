package io.bot.telegrambot.model;

import org.springframework.lang.NonNull;

public class  Update {
    private int id;
    private Message message;

    public Update(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message getMessage() {
        return message;
    }

    @NonNull
    public void setMessage(Message message) {
        this.message = message;
    }
}

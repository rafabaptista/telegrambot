package io.bot.telegrambot.model;

import org.springframework.lang.NonNull;

public class Message {
    private User user;
    private Chat chat;
    private int id;
    private int date;
    private String text;

    public Message() { }

    public User getUser() {
        return user;
    }

    @NonNull
    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    @NonNull
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @NonNull
    public String getText() {
        return text;
    }

    @NonNull
    public void setText(String text) {
        this.text = text;
    }
}

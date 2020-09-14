package io.bot.telegrambot.model;

import org.springframework.lang.NonNull;

public class User {
    private int id;
    private Boolean isBot;
    private String firstName;
    private String lastName;
    private String userName;
    private String languageCode;

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getBot() {
        return isBot;
    }

    @NonNull
    public void setBot(Boolean bot) {
        isBot = bot;
    }

    public String getFirstName() {
        return firstName;
    }

    @NonNull
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @NonNull
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    @NonNull
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    @NonNull
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}

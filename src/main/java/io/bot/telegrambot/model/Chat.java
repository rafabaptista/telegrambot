package io.bot.telegrambot.model;

import org.springframework.lang.NonNull;

public class Chat {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String title;
    private String type;
    private Boolean allMembersAreAdministrators;

    public Chat() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    @NonNull
    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    @NonNull
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    @NonNull
    public void setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
        this.allMembersAreAdministrators = allMembersAreAdministrators;
    }
}

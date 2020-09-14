package io.bot.telegrambot.dto.received;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatReceived {
    private long id;
    private @JsonProperty("first_name") String firstName;
    private @JsonProperty("last_name") String lastName;
    private @JsonProperty("username") String userName;
    private String title;
    private String type;

    public ChatReceived(){}

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    private Boolean allMembersAreAdministrators;

    public static final class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private String title;
        private String type;
        private Boolean allMembersAreAdministrators;

        public Builder withId(int id){
            this.id = id;
            return this;
        }

        public Builder withTitle(String title){
            this.title = title;
            return this;
        }

        public Builder withType(String type){
            this.type = type;
            return this;
        }

        public Builder withAllMembersAreAdministrators(Boolean allMembersAreAdministrators){
            this.allMembersAreAdministrators = allMembersAreAdministrators;
            return this;
        }

        public ChatReceived build(){
            ChatReceived chatReceived = new ChatReceived();
            chatReceived.id = this.id;
            chatReceived.firstName = this.firstName;
            chatReceived.lastName = this.lastName;
            chatReceived.title = this.title;
            chatReceived.type = this.type;
            chatReceived.allMembersAreAdministrators = this.allMembersAreAdministrators;

            return chatReceived;
        }
    }
}

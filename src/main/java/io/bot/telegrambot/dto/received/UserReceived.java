package io.bot.telegrambot.dto.received;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserReceived {
    private int id;
    private @JsonProperty("is_bot") Boolean isBot;
    private @JsonProperty("first_name") String firstName;
    private @JsonProperty("last_name") String lastName;
    private @JsonProperty("username") String userName;
    private @JsonProperty("language_code") String languageCode;


    public UserReceived(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getBot() {
        return isBot;
    }

    public void setBot(Boolean bot) {
        isBot = bot;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public static final class Builder{
        private int id;
        private Boolean isBot;
        private String firstName;
        private String lastName;
        private String userName;
        private String languageCode;

        public Builder withId(int id){
            this.id = id;
            return this;
        }

        public Builder withIsBot(Boolean isBot){
            this.isBot = isBot;
            return this;
        }

        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder withUsername(String userName){
            this.userName = userName;
            return this;
        }

        public Builder withLanguageCode(String languageCode){
            this.languageCode = languageCode;
            return this;
        }

        public UserReceived build(){
            UserReceived userReceived = new UserReceived();
            userReceived.id = this.id;
            userReceived.isBot = this.isBot;
            userReceived.firstName = this.firstName;
            userReceived.lastName = this.lastName;
            userReceived.userName = this.userName;
            userReceived.languageCode = this.languageCode;

            return userReceived;
        }
    }
}

package io.bot.telegrambot.dto.received;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageReceived {
    private @JsonProperty("from")
    UserReceived userReceived;
    private @JsonProperty("chat")
    ChatReceived chatReceived;
    private int messageId;
    private int date;
    private String text;

    public MessageReceived(){}

    public String getText(){
        return this.text;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public UserReceived getUser() {
        return userReceived;
    }

    public void setUser(UserReceived userReceived) {
        this.userReceived = userReceived;
    }

    public ChatReceived getChat() {
        return chatReceived;
    }

    public void setChat(ChatReceived chatReceived) {
        this.chatReceived = chatReceived;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static final class Builder{
        private int messageId;
        private @JsonProperty("from")
        UserReceived userReceived;
        private ChatReceived chatReceived;
        private int date;
        private String text;

        public Builder withMessageId(int messageId){
            this.messageId = messageId;
            return this;
        }

        public Builder withUser(UserReceived userReceived){
            this.userReceived = userReceived;
            return this;
        }

        public Builder withChat(ChatReceived chatReceived){
            this.chatReceived = chatReceived;
            return this;
        }

        public Builder withDate(int date){
            this.date = date;
            return this;
        }

        public Builder withText(String text){
            this.text = text;
            return this;
        }

        public MessageReceived build(){
            MessageReceived messageReceived = new MessageReceived();
            messageReceived.messageId = this.messageId;
            messageReceived.userReceived = this.userReceived;
            messageReceived.chatReceived = this.chatReceived;
            messageReceived.date = this.date;
            messageReceived.text = this.text;
            return messageReceived;
        }
    }
}

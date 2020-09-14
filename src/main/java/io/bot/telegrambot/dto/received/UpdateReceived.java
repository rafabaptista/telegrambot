package io.bot.telegrambot.dto.received;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateReceived {
    private int updateId;
    private @JsonProperty("message")
    MessageReceived messageReceived;

    public UpdateReceived(){}

    public static Builder newBuilder(){
        return new Builder();
    }

    public String getMessageText(){
        if(this.messageReceived != null){
            return this.messageReceived.getText();
        } else{
            return "";
        }
    }

    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public MessageReceived getMessage() {
        return messageReceived;
    }

    public void setMessage(MessageReceived messageReceived) {
        this.messageReceived = messageReceived;
    }

    public static final class Builder{
        private int updateId;
        private MessageReceived messageReceived;

        public Builder withUpdateId(int updateId){
            this.updateId = updateId;
            return this;
        }

        public Builder withMessage(MessageReceived messageReceived){
            this.messageReceived = messageReceived;
            return this;
        }

        public UpdateReceived build(){
            UpdateReceived telegramUpdateReceived = new UpdateReceived();
            telegramUpdateReceived.updateId = this.updateId;
            telegramUpdateReceived.messageReceived = this.messageReceived;
            return telegramUpdateReceived;
        }
    }

}

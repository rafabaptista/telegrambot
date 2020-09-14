package io.bot.telegrambot.model.mapper;

import io.bot.telegrambot.dto.received.MessageReceived;
import io.bot.telegrambot.model.Chat;
import io.bot.telegrambot.model.Message;
import io.bot.telegrambot.model.User;

public class MessageMapper {
    public static Message map(MessageReceived response) {
        Message message = new Message();
        message.setId(response.getMessageId());
        message.setText((response.getText() != null) ? response.getText() : "");
        message.setDate(response.getDate());
        message.setChat((response.getChat() != null) ? ChatMapper.map(response.getChat()) : new Chat());
        message.setUser((response.getUser() != null) ? UserMapper.map(response.getUser()) : new User());
        return message;
    }
}

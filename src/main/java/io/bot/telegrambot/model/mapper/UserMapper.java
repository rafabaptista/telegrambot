package io.bot.telegrambot.model.mapper;

import io.bot.telegrambot.dto.received.UserReceived;
import io.bot.telegrambot.model.User;

public class UserMapper {
    public static User map(UserReceived response) {
        User user = new User();
        user.setBot((response.getBot() != null) ? response.getBot() : false);
        user.setFirstName((response.getFirstName() != null) ? response.getFirstName() : "");
        user.setUserName((response.getUserName() != null) ? response.getUserName() : "");
        user.setLastName((response.getLastName() != null) ? response.getLastName() : "");
        user.setId(response.getId());
        user.setLanguageCode((response.getLanguageCode() != null) ? response.getLanguageCode() : "");
        return user;
    }
}

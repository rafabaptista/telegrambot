package io.bot.telegrambot.model.mapper;

import io.bot.telegrambot.dto.received.UpdateReceived;
import io.bot.telegrambot.model.Message;
import io.bot.telegrambot.model.Update;

public class UpdateMapper {
    public static Update map(UpdateReceived response) {
        Update update = new Update();
        update.setId(response.getUpdateId());
        update.setMessage((response.getMessage() != null) ? MessageMapper.map(response.getMessage()) : new Message());
        return update;
    }
}

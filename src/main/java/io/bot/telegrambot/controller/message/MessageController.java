package io.bot.telegrambot.controller.message;

import io.bot.telegrambot.dto.received.UpdateReceived;
import io.bot.telegrambot.model.mapper.UpdateMapper;
import io.bot.telegrambot.model.service.handler.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MessageHandler messageHandler;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String receiveTelegramUpdate(@RequestBody UpdateReceived telegramUpdateReceived){
        messageHandler.handle(UpdateMapper.map(telegramUpdateReceived));
        return "OK";
    }

    @RequestMapping(value = "/keep-alive" , method = RequestMethod.GET)
    @ResponseBody
    public String receiveKeepAliveRequest(){
        return "OK";
    }
}

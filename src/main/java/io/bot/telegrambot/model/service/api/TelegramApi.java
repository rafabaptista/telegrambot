package io.bot.telegrambot.model.service.api;

import io.bot.telegrambot.model.request.TelegramMessagePhotoRequest;
import io.bot.telegrambot.model.request.TelegramMessageTextRequest;
import io.bot.telegrambot.model.request.TelegramMessageVideoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static io.bot.telegrambot.configuration.constant.UrlConstant.API_TELEGRAM_BASE_URL;

@Service
public class TelegramApi {

    @Autowired
    private RestTemplate restTemplate;

    public void sendMessageText(TelegramMessageTextRequest request) {
        String url = API_TELEGRAM_BASE_URL + "/sendMessage";
        System.out.println("I'm calling rest template on: " + url);
        restTemplate.postForObject(url, request, String.class);
    }

    public void sendMessageVideo(TelegramMessageVideoRequest request) {
        String url = API_TELEGRAM_BASE_URL + "/sendVideo";
        System.out.println("I'm calling rest template on: " + url);
        restTemplate.postForObject(url, request, String.class);
    }

    public void sendMessagePhoto(TelegramMessagePhotoRequest request) {
        String url = API_TELEGRAM_BASE_URL + "/sendPhoto";
        System.out.println("I'm calling rest template on: " + url);
        restTemplate.postForObject(url, request, String.class);
    }
}
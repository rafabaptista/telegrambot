package io.bot.telegrambot.configuration.constant;

import static io.bot.telegrambot.configuration.constant.ValueConstant.BOT_API_KEY;

public class UrlConstant {
    public static String API_TELEGRAM_BASE_URL = "https://api.telegram.org/bot" + BOT_API_KEY;
    public static String BOT_API_BASE_URL = "<API_BASE_URL>";
    public static String BOT_API_BASE_IMAGES_URL = String.format("%s%s", BOT_API_BASE_URL, "/images/");
    public static String GOOGLE_BOOKS_API_BASE_URL = "https://www.googleapis.com/books/v1";
}

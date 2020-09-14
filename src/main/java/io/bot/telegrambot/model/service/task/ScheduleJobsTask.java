package io.bot.telegrambot.model.service.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static io.bot.telegrambot.configuration.constant.UrlConstant.BOT_API_BASE_URL;

@Service
public class ScheduleJobsTask {
    @Autowired
    private RestTemplate restTemplate;

    @Scheduled(cron = "0 0/5 * * * ?")
    public void keepAlive() {
        String url = BOT_API_BASE_URL + "/keep-alive";
        System.out.println("I'm calling rest template on: " + url);
        restTemplate.getForEntity(url, String.class);
    }
}

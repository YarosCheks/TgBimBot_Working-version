package com.example.TgBimBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TgBimBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgBimBotApplication.class, args);

		TgBimBot bot = new TgBimBot();
		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(bot);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

package com.example.TgBimBot.servise;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.File;

public class FastMethods {

    public static SendMessage sendMessage(long chatID, String text) {

        return SendMessage.builder()
                .chatId(chatID)
                .parseMode("HTML")
                .text(text)
                .build();
    }

    public static SendPhoto sendPhoto(long chatID, String caption, String filename) {

        return SendPhoto.builder()
                .chatId(chatID)
                .parseMode("HTML")
                .photo(new InputFile(new File(filename)))
                .caption(caption)
                .build();
    }

    public static SendSticker sendSticker(long chatID, String stickerID) {

        SendSticker sendSticker = new SendSticker();
        sendSticker.setSticker(new InputFile(stickerID));
        sendSticker.setChatId(chatID);

        return sendSticker;
    }

    public static EditMessageCaption editCaption(long chatID, long messageID, String caption) {

        return EditMessageCaption.builder()
                .chatId(chatID)
                .messageId((int) messageID)
                .parseMode("HTML")
                .caption(caption)
                .build();
    }

    public static EditMessageText editMessage(long chatID, long messageID, String text) {

        return EditMessageText.builder()
                .chatId(chatID)
                .messageId((int) messageID)
                .parseMode("HTML")
                .text(text)
                .build();
    }

    public static DeleteMessage deleteMessage(long chatID, long messageID) {

        return DeleteMessage.builder()
                .chatId(chatID)
                .messageId((int) messageID)
                .build();
    }

    public static InlineKeyboardButton newButton(String text, String callbackData) {

        return InlineKeyboardButton.builder()
                .text(text)
                .callbackData(callbackData)
                .build();
    }

    public static InlineKeyboardButton newButtonURL(String text, String callbackData, String url) {

        return InlineKeyboardButton.builder()
                .text(text)
                .callbackData(callbackData)
                .url(url)
                .build();
    }

    public static String productText(String information) {

        String[] info = information.split("_");

        String title = info[0];

        String conditions = info[1];
        String result = info[2];



        if (conditions == null && result == null) {
            return STR."<b>\{title}</b>\n\n" +
                    "<b>Размер выплаты:</b>\n" +
                    "<i>• Выплата мне - 1000р;\n" +
                    "• Выплата вам - 500р.</i>\n\n" +
                    "Остались вопросы - /support";
        } else if (result == null) {
            return STR."<b>\{title}</b>\n\n" +
                    "<b>Условия получения бонуса:</b>\n" +
                    "<i>• Вы делаете покупку от 300 рублей одной операцией в течение 90 дней;\n" +
                    "• В течение 7 дней после обработки операции мне и вам придёт бонус.</i>\n\n" +
                    "<b>Размер выплаты:</b>\n" +
                    "<i>• Выплата мне - 1000р;\n" +
                    "• Выплата вам - 500р.</i>\n\n" +
                    "Остались вопросы - /support";
        } else if (conditions == null) {
            return STR."<b>\{title}</b>\n\n" +
                    "<b>Условия получения бонуса:</b>\n" +
                    "<i>• Вы делаете покупку от 300 рублей одной операцией в течение 90 дней;\n" +
                    "• В течение 7 дней после обработки операции мне и вам придёт бонус.</i>\n\n" +
                    "<b>Размер выплаты по умолчанию:</b>\n" +
                    "<i>• Выплата мне - 1000р;\n" +
                    "• Выплата вам - 500р.</i>\n\n" +
                    "<b>Итоговое распределение выплаты:</b>\n" +
                    "<i>• Я перевожу вам 250р;\n" +
                    "• Каждый оказывается в плюсе на 750р.</i>\n\n" +
                    "Остались вопросы - /support";
        }
        return null;
    }
}
package com.example.TgBimBot.servise.commands.buttons;

import com.example.TgBimBot.finalVariables.Links;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData;
import com.example.TgBimBot.finalVariables.messageTexts.NeutralMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class NeutralButtons {

    public static EditMessageCaption buttonBackBegin(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, NeutralMessageTexts.START_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.BEGIN_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rows.add(row_1);

        markup.setKeyboard(rows);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonBegin(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, NeutralMessageTexts.BEGIN_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();
        List<InlineKeyboardButton> row_2 = new ArrayList<>();
        List<InlineKeyboardButton> row_3 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.WELCOME_BUTTON_NAME, NeutralCallbackData.WELCOME_BUTTON));

        row_2.add(FastMethods.newButtonURL(NeutralButtonNames.SMICH_CHANNEL_NAME, NeutralCallbackData.URL_BUTTON, Links.SMICH_CHANNEL_URL));
        row_2.add(FastMethods.newButtonURL(NeutralButtonNames.BIMARIUM_CHANNEL_NAME, NeutralCallbackData.URL_BUTTON, Links.BIMARIUM_CHANNEL_URL));

        row_3.add(FastMethods.newButton(NeutralButtonNames.BACK_BEGIN_BUTTON_NAME, NeutralCallbackData.BACK_BEGIN_BUTTON));

        rows.add(row_1);
        rows.add(row_2);
        rows.add(row_3);

        markup.setKeyboard(rows);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWelcome(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, NeutralMessageTexts.WELCOME_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();
        List<InlineKeyboardButton> row_2 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.BANKS_BUTTON_NAME, NeutralCallbackData.BANKS_BUTTON));
        row_1.add(FastMethods.newButton(NeutralButtonNames.WORKS_BUTTON_NAME, NeutralCallbackData.WORKS_BUTTON));

        row_2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));

        rows.add(row_1);
        rows.add(row_2);

        markup.setKeyboard(rows);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonBanks(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, NeutralMessageTexts.BANKS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();
        List<InlineKeyboardButton> row_2 = new ArrayList<>();
        List<InlineKeyboardButton> row_3 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.ALFA_BANK_BUTTON_NAME, NeutralCallbackData.ALFA_BANK_BUTTON));

        row_2.add(FastMethods.newButton(NeutralButtonNames.T_BANK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        row_3.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        row_3.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.WELCOME_BUTTON));

        rows.add(row_1);
        rows.add(row_2);
        rows.add(row_3);

        markup.setKeyboard(rows);
        caption.setReplyMarkup(markup);

        return caption;
    }
}

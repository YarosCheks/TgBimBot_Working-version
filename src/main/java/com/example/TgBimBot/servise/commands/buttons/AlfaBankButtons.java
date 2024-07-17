package com.example.TgBimBot.servise.commands.buttons;

import com.example.TgBimBot.finalVariables.Links;
import com.example.TgBimBot.finalVariables.buttons.alfabank.AlfabankButtonNames;
import com.example.TgBimBot.finalVariables.buttons.alfabank.AlfabankCallbackData;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData;
import com.example.TgBimBot.finalVariables.messageTexts.AlfaBankMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class AlfaBankButtons {

    public static EditMessageCaption buttonAlfaBank(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, AlfaBankMessageTexts.ALFA_BANK_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.CARDS_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CARDS_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BUSINESS_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_BUSINESS_BUTTON));
        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.OTHER_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_OTHER_BUTTON));

        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.BANKS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankCards(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, AlfaBankMessageTexts.ALFA_BANK_CARDS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons5 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_DEBIT_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_DEBIT_BUTTON));
        rowButtons2.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_CREDIT_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CREDIT_BUTTON));
        rowButtons3.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_ONLY_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_ONLY_BUTTON));
        rowButtons4.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_TRAVEL_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_TRAVEL_BUTTON));

        rowButtons5.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons5.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.ALFA_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);
        rowsButtons.add(rowButtons5);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankDebitCard(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_DEBIT_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_DEBIT_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankCreditCard(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_CREDIT_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_CREDIT_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankOnlyCard(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_ONLY_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_ONLY_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankTravelCard(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_TRAVEL_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_TRAVEL_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankBusiness(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, AlfaBankMessageTexts.ALFA_BANK_BUSINESS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_BUSINESS_ACCOUNT_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_BUSINESS_ACCOUNT_BUTTON));
        rowButtons2.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_BUSINESS_REGISTRATION_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_BUSINESS_REGISTRATION_BUTTON));

        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.ALFA_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankBusinessAccount(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_BUSINESS_ACCOUNT_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_BUSINESS_ACCOUNT_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_BUSINESS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankBusinessRegistration(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_BUSINESS_REGISTRATION_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_BUSINESS_REGISTRATION_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_BUSINESS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankOther(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, AlfaBankMessageTexts.ALFA_BANK_OTHER_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(AlfabankButtonNames.ALFA_BANK_STICKER_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_STICKER_BUTTON));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.ALFA_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonAlfaBankSticker(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, AlfaBankMessageTexts.ALFA_BANK_STICKER_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.ALFA_BANK_STICKER_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, AlfabankCallbackData.ALFA_BANK_OTHER_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }
}

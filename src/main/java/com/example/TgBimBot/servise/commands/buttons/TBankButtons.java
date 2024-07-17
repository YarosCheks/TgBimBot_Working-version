package com.example.TgBimBot.servise.commands.buttons;

import com.example.TgBimBot.finalVariables.Links;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData;
import com.example.TgBimBot.finalVariables.buttons.tbank.TBankButtonNames;
import com.example.TgBimBot.finalVariables.buttons.tbank.TBankCallbackData;
import com.example.TgBimBot.finalVariables.messageTexts.TBankMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class TBankButtons {

    public static EditMessageCaption buttonTBank(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons5 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons6 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.CARDS_BUTTON_NAME, TBankCallbackData.T_BANK_CARDS_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BUSINESS_BUTTON_NAME, TBankCallbackData.T_BANK_BUSINESS_BUTTON));
        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.INSURANCE_BUTTON_NAME, TBankCallbackData.T_BANK_INSURANCE_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.CREDITS_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));
        rowButtons5.add(FastMethods.newButton(NeutralButtonNames.OTHER_BUTTON_NAME, TBankCallbackData.T_BANK_OTHER_BUTTON));

        rowButtons6.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons6.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.BANKS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);
        rowsButtons.add(rowButtons5);
        rowsButtons.add(rowButtons6);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCards(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_CARDS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(TBankButtonNames.T_BANK_BLACK_BUTTON_NAME, TBankCallbackData.T_BANK_BLACK_BUTTON));
        rowButtons2.add(FastMethods.newButton(TBankButtonNames.T_BANK_PLATINUM_BUTTON_NAME, TBankCallbackData.T_BANK_PLATINUM_BUTTON));

        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankBusiness(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_BUSINESS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(TBankButtonNames.T_BANK_BUSINESS_ACCOUNT_BUTTON_NAME, TBankCallbackData.T_BANK_BUSINESS_ACCOUNT_BUTTON));
        rowButtons2.add(FastMethods.newButton(TBankButtonNames.T_BANK_BUSINESS_REGISTRATION_BUTTON_NAME, TBankCallbackData.T_BANK_BUSINESS_REGISTRATION_BUTTON));

        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons3.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankInsurance(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_INSURANCE_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(TBankButtonNames.T_BANK_CASCO_BUTTON_NAME, TBankCallbackData.T_BANK_CASCO_BUTTON));
        rowButtons2.add(FastMethods.newButton(TBankButtonNames.T_BANK_OSAGO_BUTTON_NAME, TBankCallbackData.T_BANK_OSAGO_BUTTON));
        rowButtons3.add(FastMethods.newButton(TBankButtonNames.T_BANK_MORTGAGE_INSURANCE_BUTTON_NAME, TBankCallbackData.T_BANK_MORTGAGE_INSURANCE_BUTTON));

        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCredits(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_CREDITS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons5 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons6 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(TBankButtonNames.T_BANK_CREDIT_CASH_BUTTON_NAME, TBankCallbackData.T_BANK_CREDIT_CASH_BUTTON));
        rowButtons2.add(FastMethods.newButton(TBankButtonNames.T_BANK_CREDIT_AUTO_BUTTON_NAME, TBankCallbackData.T_BANK_CREDIT_AUTO_BUTTON));
        rowButtons3.add(FastMethods.newButton(TBankButtonNames.T_BANK_CREDIT_BY_AUTO_BUTTON_NAME, TBankCallbackData.T_BANK_CREDIT_BY_AUTO_BUTTON));
        rowButtons4.add(FastMethods.newButton(TBankButtonNames.T_BANK_CREDIT_BY_ESTATE_BUTTON_NAME, TBankCallbackData.T_BANK_CREDIT_BY_ESTATE_BUTTON));
        rowButtons5.add(FastMethods.newButton(TBankButtonNames.T_BANK_CREDIT_REFINANCING_BUTTON_NAME, TBankCallbackData.T_BANK_CREDIT_REFINANCING_BUTTON));

        rowButtons6.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons6.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);
        rowsButtons.add(rowButtons5);
        rowsButtons.add(rowButtons6);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankOther(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, TBankMessageTexts.T_BANK_OTHER_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(TBankButtonNames.T_BANK_MOBILE_BUTTON_NAME, TBankCallbackData.T_BANK_MOBILE_BUTTON));
        rowButtons2.add(FastMethods.newButton(TBankButtonNames.T_BANK_INVESTMENT_BUTTON_NAME, TBankCallbackData.T_BANK_INVESTMENT_BUTTON));
        rowButtons3.add(FastMethods.newButton(TBankButtonNames.T_BANK_AIR_BUTTON_NAME, TBankCallbackData.T_BANK_AIR_BUTTON));

        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.T_BANK_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankBlack(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_BLACK_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_BLACK_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankPlatinum(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_PLATINUM_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_PLATINUM_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CARDS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankMobile(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_MOBILE_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_MOBILE_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_OTHER_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankInvestment(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_INVESTMENT_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_INVESTMENT_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_OTHER_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankBusinessAccount(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_BUSINESS_ACCOUNT_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_BUSINESS_ACCOUNT_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_BUSINESS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankBusinessRegistration(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_BUSINESS_REGISTRATION_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_BUSINESS_REGISTRATION_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_BUSINESS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankAir(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_AIR_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_AIR_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_OTHER_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCreditCash(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CREDIT_CASH_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CREDIT_CASH_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCreditAuto(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CREDIT_AUTO_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CREDIT_AUTO_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCreditByAuto(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CREDIT_BY_AUTO_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CREDIT_BY_AUTO_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCreditByEstate(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CREDIT_BY_ESTATE_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CREDIT_BY_ESTATE_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCreditRefinancing(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CREDIT_REFINANCING_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CREDIT_REFINANCING_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_CREDITS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankCASCO(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_CASCO_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_CASCO_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_INSURANCE_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankOSAGO(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_OSAGO_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_OSAGO_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_INSURANCE_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonTBankMortgageInsurance(long chatId, long messageId) {

        EditMessageCaption caption = FastMethods.editCaption(chatId, messageId, TBankMessageTexts.T_BANK_MORTGAGE_INSURANCE_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTRATION_PRODUCT_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.T_BANK_MORTGAGE_INSURANCE_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, TBankCallbackData.T_BANK_INSURANCE_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }
}

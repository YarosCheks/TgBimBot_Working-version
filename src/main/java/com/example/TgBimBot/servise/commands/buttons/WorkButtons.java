package com.example.TgBimBot.servise.commands.buttons;

import com.example.TgBimBot.finalVariables.Links;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData;
import com.example.TgBimBot.finalVariables.buttons.works.WorkButtonCallbackData;
import com.example.TgBimBot.finalVariables.buttons.works.WorkButtonNames;
import com.example.TgBimBot.finalVariables.messageTexts.WorksMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import com.example.TgBimBot.servise.FormKuper;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorkButtons {

    public static EditMessageCaption buttonWorks(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_BUTTON));
        rowButtons2.add(FastMethods.newButton(WorkButtonNames.WORKS_YANDEX_SMENA_BUTTON_NAME, WorkButtonCallbackData.WORKS_YANDEX_SMENA_BUTTON));
        rowButtons3.add(FastMethods.newButton(WorkButtonNames.WORKS_T_BANK_BUTTON_NAME, WorkButtonCallbackData.WORKS_T_BANK_BUTTON));

        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.WELCOME_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksTBank(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_T_BANK_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTER_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.WORKS_T_BANK_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.WORKS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksYandexSmena(long chatID, long messageID) {

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_YANDEX_SMENA_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButtonURL(NeutralButtonNames.REGISTER_BUTTON_NAME, NeutralCallbackData.URL_BUTTON, Links.WORKS_YANDEX_SMENA_URL));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.WORKS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuper(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.remove(chatID);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.FILL_FORM_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_FILL_FORM_BUTTON));

        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, NeutralCallbackData.WORKS_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperFillForm(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        if (!kuperForms.containsKey(chatID)) {
            kuperForms.put(chatID, new FormKuper());
        }

        if (kuperForms.get(chatID).getRole() != null) {
            kuperForms.get(chatID).setRole(null);
        }

        kuperForms.get(chatID).setMessageID(messageID);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_FILL_FORM_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_WALKER_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_WALKER_BUTTON));
        rowButtons2.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_DRIVER_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_DRIVER_BUTTON));
        rowButtons3.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_COLLECTOR_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_COLLECTOR_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperWalker(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setRole("Пеший курьер");

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_2_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_FILL_FORM_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperDriver(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setRole("Водитель-курьер");

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_2_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_FILL_FORM_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperCollector(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setRole("Сборщик заказов");

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_2_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_FILL_FORM_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperRole(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setRole(null);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_FILL_FORM_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons4 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_WALKER_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_WALKER_BUTTON));
        rowButtons2.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_DRIVER_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_DRIVER_BUTTON));
        rowButtons3.add(FastMethods.newButton(WorkButtonNames.WORKS_KUPER_COLLECTOR_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_COLLECTOR_BUTTON));
        rowButtons4.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_FILL_FORM_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);
        rowsButtons.add(rowButtons3);
        rowsButtons.add(rowButtons4);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperStep2(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setCity(null);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_2_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_ROLE_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperStep3(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setName(null);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_3_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_STEP_2_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperStep4(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setNumber(null);

        EditMessageCaption caption = FastMethods.editCaption(chatID, messageID, WorksMessageTexts.WORKS_KUPER_STEP_4_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_STEP_3_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption buttonWorksKuperSendForm(long chatID, long messageID, Map<Long, FormKuper> kuperForms) {

        EditMessageCaption caption = FastMethods.editCaption(chatID,
                messageID,
                WorksMessageTexts.WORKS_KUPER_SEND_FORM_MESSAGE(chatID, kuperForms));

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.MAIN_MANU_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }
}

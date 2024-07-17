package com.example.TgBimBot.servise.commands;

import com.example.TgBimBot.finalVariables.Neutral;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.works.WorkButtonCallbackData;
import com.example.TgBimBot.finalVariables.messageTexts.WorksMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import com.example.TgBimBot.servise.FormKuper;
import com.example.TgBimBot.servise.Person;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TextCommands {

    public static SendMessage sendSupportMessage(Message command, Map<Long, Person> persons) {

        String user = STR."@\{command.getChat().getUserName()}";

        if (command.getChat().getUserName() == null) {
            if (command.getChat().getLastName() == null) {
                user = command.getChat().getFirstName();
            } else {
                user = STR."\{command.getChat().getFirstName()} \{command.getChat().getLastName()}";
            }
        }

        persons.get(command.getChatId()).setText(command.getText());
        persons.get(command.getChatId()).setUsername(user);

        SendMessage message = FastMethods.sendMessage(Neutral.neyarexChatID,
                STR."<b>User:</b> \{user}\n" +
                STR."<b>ID:</b> <code>\{command.getChatId()}</code>\n\n" +
                STR."<b>Сообщение:</b>\n\{command.getText()}");

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.PROCESS_MESSAGE, Long.toString(command.getChatId())));

        rows.add(row_1);

        markup.setKeyboard(rows);
        message.setReplyMarkup(markup);

        return message;
    }

    public static EditMessageCaption setKuperCity(long chatID, String city, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setCity(city);

        EditMessageCaption caption = FastMethods.editCaption(chatID, kuperForms.get(chatID).getMessageID(), WorksMessageTexts.WORKS_KUPER_STEP_3_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_STEP_2_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption setKuperName(long chatID, String name, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setName(name);

        EditMessageCaption caption = FastMethods.editCaption(chatID, kuperForms.get(chatID).getMessageID(), WorksMessageTexts.WORKS_KUPER_STEP_4_MESSAGE);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_STEP_3_BUTTON));

        rowsButtons.add(rowButtons1);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }

    public static EditMessageCaption setKuperNumber(long chatID, String name, Map<Long, FormKuper> kuperForms) {

        kuperForms.get(chatID).setNumber(name);

        EditMessageCaption caption = FastMethods.editCaption(chatID, kuperForms.get(chatID).getMessageID(), WorksMessageTexts.WORKS_KUPER_DONE_MESSAGE(chatID, kuperForms));

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> rowButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> rowButtons2 = new ArrayList<>();

        rowButtons1.add(FastMethods.newButton(NeutralButtonNames.SEND_FORM_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_SEND_FORM_BUTTON));
        rowButtons2.add(FastMethods.newButton(NeutralButtonNames.BACK_BUTTON_NAME, WorkButtonCallbackData.WORKS_KUPER_STEP_4_BUTTON));

        rowsButtons.add(rowButtons1);
        rowsButtons.add(rowButtons2);

        markup.setKeyboard(rowsButtons);
        caption.setReplyMarkup(markup);

        return caption;
    }
}

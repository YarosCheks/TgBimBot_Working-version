package com.example.TgBimBot.servise.commands;

import com.example.TgBimBot.finalVariables.Filenames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralButtonNames;
import com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData;
import com.example.TgBimBot.finalVariables.messageTexts.NeutralMessageTexts;
import com.example.TgBimBot.servise.FastMethods;
import com.example.TgBimBot.servise.Person;
import com.example.TgBimBot.servise.FormKuper;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SlashCommands {

    public static SendPhoto slashStart(long chatID, Map<Long, FormKuper> kuperForms) {

        kuperForms.remove(chatID);

        SendPhoto photo = FastMethods.sendPhoto(chatID, NeutralMessageTexts.START_MESSAGE, Filenames.DEFAULT_PHOTO);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row_1 = new ArrayList<>();

        row_1.add(FastMethods.newButton(NeutralButtonNames.BEGIN_BUTTON_NAME, NeutralCallbackData.BEGIN_BUTTON));
        rows.add(row_1);

        markup.setKeyboard(rows);
        photo.setReplyMarkup(markup);

        return photo;
    }

    public static SendMessage slashSupport(long chatID, Map<Long, Person> persons) {

        if (persons.containsKey(chatID) && persons.get(chatID).getText() != null) {

            return FastMethods.sendMessage(chatID, NeutralMessageTexts.SUPPORT_MESSAGE_2);

        } else {

            persons.put(chatID, new Person());
            return FastMethods.sendMessage(chatID, NeutralMessageTexts.SUPPORT_MESSAGE_1);

        }
    }
}

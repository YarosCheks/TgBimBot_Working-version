package com.example.TgBimBot;

import com.example.TgBimBot.servise.FormKuper;
import com.example.TgBimBot.servise.Person;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static com.example.TgBimBot.finalVariables.Emojis.*;
import static com.example.TgBimBot.finalVariables.Neutral.*;
import static com.example.TgBimBot.finalVariables.buttons.alfabank.AlfabankCallbackData.*;
import static com.example.TgBimBot.finalVariables.buttons.neutral.NeutralCallbackData.*;
import static com.example.TgBimBot.finalVariables.buttons.tbank.TBankCallbackData.*;
import static com.example.TgBimBot.finalVariables.buttons.works.WorkButtonCallbackData.*;
import static com.example.TgBimBot.finalVariables.messageTexts.NeutralMessageTexts.SUPPORT_MESSAGE_3;
import static com.example.TgBimBot.finalVariables.messageTexts.NeutralMessageTexts.SUPPORT_MESSAGE_4;
import static com.example.TgBimBot.finalVariables.stikers.StepfatherStickers.stepfatherStickers;
import static com.example.TgBimBot.servise.FastMethods.*;
import static com.example.TgBimBot.servise.commands.SlashCommands.slashStart;
import static com.example.TgBimBot.servise.commands.SlashCommands.slashSupport;
import static com.example.TgBimBot.servise.commands.TextCommands.*;
import static com.example.TgBimBot.servise.commands.buttons.AlfaBankButtons.*;
import static com.example.TgBimBot.servise.commands.buttons.NeutralButtons.*;
import static com.example.TgBimBot.servise.commands.buttons.TBankButtons.*;
import static com.example.TgBimBot.servise.commands.buttons.WorkButtons.*;

@Component
public class TgBimBot extends TelegramLongPollingBot {

    Map<Long, Person> persons = new HashMap<>();
    Map<Long, FormKuper> kuperForms = new HashMap<>();

    public TgBimBot() {
        super("TOKEN");
    }
    @Override
    public String getBotUsername() {
        return "TgBimBot";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {

            Message command = update.getMessage();
            long chatID = update.getMessage().getChatId();
            long messageID = update.getMessage().getMessageId();
            String messageText = update.getMessage().getText();

            switch (messageText) {

                case "/start" -> executePhoto(slashStart(chatID, kuperForms));
                case "/support" -> executeSender(slashSupport(chatID, persons));

                default -> {

                    if (persons.containsKey(chatID) && persons.get(chatID).getText() == null) {

                        executeSender(sendSupportMessage(command, persons));
                        executeSender(sendMessage(chatID, SUPPORT_MESSAGE_4));

                    } else if (kuperForms.containsKey(chatID)) {

                        if (kuperForms.get(chatID).getCity() == null) {

                            executeCaption(setKuperCity(chatID, messageText, kuperForms));
                            executeDelete(deleteMessage(chatID, messageID));

                        } else if (kuperForms.get(chatID).getName() == null) {

                            executeCaption(setKuperName(chatID, messageText, kuperForms));
                            executeDelete(deleteMessage(chatID, messageID));

                        } else if (kuperForms.get(chatID).getNumber() == null) {

                            executeCaption(setKuperNumber(chatID, messageText, kuperForms));
                            executeDelete(deleteMessage(chatID, messageID));
                        }

                    } else {

                        executeSender(SendMessage.builder()
                                .chatId(command.getChatId())
                                .parseMode("HTML")
                                .text("Нихера не понял, но очень интересно")
                                .build());
                    }
                }
            }
        } else if (update.hasCallbackQuery()) {

            long chatID = update.getCallbackQuery().getMessage().getChatId();
            long messageID = update.getCallbackQuery().getMessage().getMessageId();
            String callbackData = update.getCallbackQuery().getData();

            switch (callbackData) {

                case BACK_BEGIN_BUTTON -> executeCaption(buttonBackBegin(chatID, messageID));
                case BEGIN_BUTTON -> executeCaption(buttonBegin(chatID, messageID));
                case WELCOME_BUTTON -> executeCaption(buttonWelcome(chatID, messageID));
                case BANKS_BUTTON -> executeCaption(buttonBanks(chatID, messageID));

                case ALFA_BANK_BUTTON -> executeCaption(buttonAlfaBank(chatID, messageID));
                case ALFA_BANK_CARDS_BUTTON -> executeCaption(buttonAlfaBankCards(chatID, messageID));
                case ALFA_BANK_BUSINESS_BUTTON -> executeCaption(buttonAlfaBankBusiness(chatID, messageID));

                case ALFA_BANK_DEBIT_BUTTON -> executeCaption(buttonAlfaBankDebitCard(chatID, messageID));
                case ALFA_BANK_CREDIT_BUTTON -> executeCaption(buttonAlfaBankCreditCard(chatID, messageID));
                case ALFA_BANK_ONLY_BUTTON -> executeCaption(buttonAlfaBankOnlyCard(chatID, messageID));
                case ALFA_BANK_TRAVEL_BUTTON -> executeCaption(buttonAlfaBankTravelCard(chatID, messageID));

                case ALFA_BANK_BUSINESS_ACCOUNT_BUTTON -> executeCaption(buttonAlfaBankBusinessAccount(chatID, messageID));
                case ALFA_BANK_BUSINESS_REGISTRATION_BUTTON -> executeCaption(buttonAlfaBankBusinessRegistration(chatID, messageID));

                case ALFA_BANK_OTHER_BUTTON -> executeCaption(buttonAlfaBankOther(chatID, messageID));
                case ALFA_BANK_STICKER_BUTTON -> executeCaption(buttonAlfaBankSticker(chatID, messageID));

                case T_BANK_BUTTON -> executeCaption(buttonTBank(chatID, messageID));
                case T_BANK_CARDS_BUTTON -> executeCaption(buttonTBankCards(chatID, messageID));
                case T_BANK_BUSINESS_BUTTON -> executeCaption(buttonTBankBusiness(chatID, messageID));
                case T_BANK_INSURANCE_BUTTON -> executeCaption(buttonTBankInsurance(chatID, messageID));
                case T_BANK_CREDITS_BUTTON -> executeCaption(buttonTBankCredits(chatID, messageID));
                case T_BANK_OTHER_BUTTON -> executeCaption(buttonTBankOther(chatID, messageID));

                case T_BANK_BLACK_BUTTON -> executeCaption(buttonTBankBlack(chatID, messageID));
                case T_BANK_PLATINUM_BUTTON -> executeCaption(buttonTBankPlatinum(chatID, messageID));
                case T_BANK_BUSINESS_ACCOUNT_BUTTON -> executeCaption(buttonTBankBusinessAccount(chatID, messageID));
                case T_BANK_BUSINESS_REGISTRATION_BUTTON -> executeCaption(buttonTBankBusinessRegistration(chatID, messageID));
                case T_BANK_CASCO_BUTTON -> executeCaption(buttonTBankCASCO(chatID, messageID));
                case T_BANK_OSAGO_BUTTON -> executeCaption(buttonTBankOSAGO(chatID, messageID));
                case T_BANK_MORTGAGE_INSURANCE_BUTTON -> executeCaption(buttonTBankMortgageInsurance(chatID, messageID));
                case T_BANK_CREDIT_CASH_BUTTON -> executeCaption(buttonTBankCreditCash(chatID, messageID));
                case T_BANK_CREDIT_AUTO_BUTTON -> executeCaption(buttonTBankCreditAuto(chatID, messageID));
                case T_BANK_CREDIT_BY_AUTO_BUTTON -> executeCaption(buttonTBankCreditByAuto(chatID, messageID));
                case T_BANK_CREDIT_BY_ESTATE_BUTTON -> executeCaption(buttonTBankCreditByEstate(chatID, messageID));
                case T_BANK_CREDIT_REFINANCING_BUTTON -> executeCaption(buttonTBankCreditRefinancing(chatID, messageID));
                case T_BANK_MOBILE_BUTTON -> executeCaption(buttonTBankMobile(chatID, messageID));
                case T_BANK_INVESTMENT_BUTTON -> executeCaption(buttonTBankInvestment(chatID, messageID));
                case T_BANK_AIR_BUTTON -> executeCaption(buttonTBankAir(chatID, messageID));

                case WORKS_BUTTON -> executeCaption(buttonWorks(chatID, messageID));
                case WORKS_T_BANK_BUTTON -> executeCaption(buttonWorksTBank(chatID, messageID));
                case WORKS_YANDEX_SMENA_BUTTON -> executeCaption(buttonWorksYandexSmena(chatID, messageID));

                case WORKS_KUPER_BUTTON -> executeCaption(buttonWorksKuper(chatID, messageID, kuperForms));
                case WORKS_KUPER_FILL_FORM_BUTTON -> executeCaption(buttonWorksKuperFillForm(chatID, messageID, kuperForms));
                case WORKS_KUPER_WALKER_BUTTON -> executeCaption(buttonWorksKuperWalker(chatID, messageID, kuperForms));
                case WORKS_KUPER_DRIVER_BUTTON -> executeCaption(buttonWorksKuperDriver(chatID, messageID, kuperForms));
                case WORKS_KUPER_COLLECTOR_BUTTON -> executeCaption(buttonWorksKuperCollector(chatID, messageID, kuperForms));
                case WORKS_KUPER_ROLE_BUTTON -> executeCaption(buttonWorksKuperRole(chatID, messageID, kuperForms));
                case WORKS_KUPER_STEP_2_BUTTON -> executeCaption(buttonWorksKuperStep2(chatID, messageID, kuperForms));
                case WORKS_KUPER_STEP_3_BUTTON -> executeCaption(buttonWorksKuperStep3(chatID, messageID, kuperForms));
                case WORKS_KUPER_STEP_4_BUTTON -> executeCaption(buttonWorksKuperStep4(chatID, messageID, kuperForms));
                case WORKS_KUPER_SEND_FORM_BUTTON -> {
                    executeSender(sendMessage(neyarexChatID, kuperForms.get(chatID).toString()));
                    executeCaption(buttonWorksKuperSendForm(chatID, messageID, kuperForms));
                    kuperForms.remove(chatID);
                }

                default -> {

                    if (chatID == neyarexChatID) {

                        long personChatID = Long.parseLong(callbackData);

                        executeEditor(editMessage(chatID, messageID,
                                STR."<b>User:</b> \{persons.get(personChatID).getUsername()}\n" +
                                STR."<b>ID:</b> <code>\{personChatID}</code>\n\n" +
                                STR."<b>Сообщение:</b> \{persons.get(personChatID).getText()}\n\n" +
                                "<i>Обращение обработано!</i>"));

                        persons.remove(personChatID);

                        executeSender(sendMessage(personChatID, SUPPORT_MESSAGE_3));
                    }
                }
            }
        } else if (update.hasMessage() && update.getMessage().hasSticker()) {

            Random random = new Random();
            int sticker = random.nextInt(48);

            long chatID = update.getMessage().getChatId();
            String stickerID = stepfatherStickers.get(sticker);

            executeSticker(sendSticker(chatID, stickerID));

        } else if (update.hasMessage() && update.getMessage().hasVoice()) {

            long chatID = update.getMessage().getChatId();
            executeSender(sendMessage(chatID, "Нафиг мне твоё гс? " +
                    STR."Я не умею с ними работать \{SAD_TEARS}"));

        }
    }

    private void executeSender(SendMessage message) {

        try {
            execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void executeEditor(EditMessageText message) {

        try {
            execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void executePhoto(SendPhoto photo) {

        try {
            execute(photo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void executeCaption(EditMessageCaption caption) {

        try {
            execute(caption);
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void executeDelete(DeleteMessage message) {

        try {
            execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void executeSticker(SendSticker sticker) {

        try {
            execute(sticker);
        } catch (TelegramApiException e) {
            System.out.println(e.getMessage());
        }
    }
}

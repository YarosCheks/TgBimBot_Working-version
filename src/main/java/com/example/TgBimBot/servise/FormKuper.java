package com.example.TgBimBot.servise;

public class FormKuper {

    long messageID;

    private String role;
    private String city;
    private String name;
    private String number;

    public void setMessageID(long messageID) {
        this.messageID = messageID;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public long getMessageID() {
        return messageID;
    }

    public String getRole() {
        return role;
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }

    public String toString() {
        return STR."<b>Роль:</b> <i>\{role}</i>\n" +
                STR."<b>Город:</b> <i>\{city}</i>\n" +
                STR."<b>Имя:</b> <i>\{name}</i>\n" +
                STR."<b>Номер:</b> <i>\{number}</i>";
    }
}

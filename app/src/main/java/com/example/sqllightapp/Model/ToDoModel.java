package com.example.sqllightapp.Model;

public class ToDoModel {

    private String cardTitle = "";
    private String cardDescription = "";
    private String cardMail = "";
    private int id;

    public ToDoModel() {
    }

    public ToDoModel(int id, String cardTitle, String cardDescription, String cardMail) {
        this.cardTitle = cardTitle;
        this.cardDescription = cardDescription;
        this.cardMail = cardMail;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardMail() {
        return cardMail;
    }

    public void setCardMail(String cardMail) {
        this.cardMail = cardMail;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }
}

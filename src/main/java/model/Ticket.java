package model;

import utils.Constants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private int uniqueCode;
    private String title;
    private String description;
    private double price;
    private MoneyType moneyType;
    private String location;

    public Ticket() {

    }

    public Ticket(int uniqueCode, String title, String description, double price, MoneyType moneyType, String location) {
        this.uniqueCode = uniqueCode;
        this.title = title;
        this.description = description;
        this.price = price;
        this.moneyType = moneyType;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}

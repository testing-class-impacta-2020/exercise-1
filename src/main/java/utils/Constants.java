package utils;

import model.MoneyType;
import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public static void ValueTests() {
        tickets.add(new Ticket(1, "Show do Luan Santana", "Melhor show do ano", 50.0, MoneyType.DOLAR, "São Paulo - SP"));
        tickets.add(new Ticket(2, "Show do Luan Santana", "Melhor show do ano", 50.0, MoneyType.EURO, "São Paulo - SP"));
        tickets.add(new Ticket(3, "Show do Luan Santana", "Melhor show do ano", 50.0, MoneyType.REAIS, "São Paulo - SP"));
    }
}

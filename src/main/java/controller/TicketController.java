package controller;

import model.MoneyType;
import model.MyTicket;
import model.Ticket;
import model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TicketController {
    public MyTicket buyTicket(int uniqueCode, User user, double balance, MoneyType moneyType, ArrayList<Ticket> ticketList) {
        MyTicket myTicket = new MyTicket();
        Ticket ticket = new Ticket();
        ArrayList<Ticket> listTickets = ticketList;

        if (user == null) {
            System.out.println("User is null.");
            return null;
        }

        if(user.getDocument() == null) {
            System.out.println("UserDocument is null.");
            return null;
        }

        if(user.getName() == null) {
            System.out.println("UserName is null.");
            return null;
        }

        if (balance <= 0) {
            System.out.println("Balance invalid");
            return null;
        }

        if (listTickets == null) {
            System.out.println("ListTickets is null");
            return null;
        }

        if(moneyType == null ) {
            System.out.println("MoneyType is null");
            return null;
        }


        if (listTickets.size() == 0) {
            System.out.println("ListTickets size == 0");
            return null;
        }

        boolean contains = false;
        for (Ticket itemTicket : listTickets) {
            if (itemTicket.getUniqueCode() >= 0) {
                if (itemTicket.getUniqueCode() == uniqueCode) {
                    ticket = itemTicket;
                    contains = true;
                }
            }
        }



        if (contains == true) {


            if (ticket.getPrice() >= 0 && balance == ticket.getPrice()) {
                if (moneyType.equals(ticket.getMoneyType())) {
                    myTicket.setTicket(ticket);
                    myTicket.setUser(user);

                    return myTicket;
                } else {
                    System.out.println("Money Type isn't equals");
                    return null;
                }
            } else {
                System.out.println("Ticket price not equals balance.");
                return null;
            }
        } else {
            System.out.println("Ticket Nonexistent.");
            return null;
        }
    }
}




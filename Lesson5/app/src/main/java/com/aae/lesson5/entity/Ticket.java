package com.aae.lesson5.entity;

public class Ticket {

    private int id;
    private float ticketPrice;
    private int numberOfTickets;

    public Ticket() {

    }

    public Ticket(int id, float ticketPrice, int numberOfTickets) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets;
    }
}

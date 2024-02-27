package com.aae.lesson5.entity;

public class TicketChild extends Ticket{

    private float ticketDiscount;

    public TicketChild() {

    }

    public TicketChild(int id, float ticketPrice, int numberOfTivkets, float ticketDiscount) {
        super(id, ticketPrice, numberOfTivkets);
        this.ticketDiscount = ticketDiscount;
    }

    public float getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(float ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)/100;
    }
}

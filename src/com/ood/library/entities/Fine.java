package com.ood.library.entities;

public class Fine {
    double fineAmount;
    double atRate;
    boolean isPaid;
    Booking booking;

    public Fine(double fineAmount, double atRate, Booking booking) {
        this.fineAmount = fineAmount;
        this.atRate = atRate;
        this.booking = booking;
        this.isPaid = false;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public double getAtRate() {
        return atRate;
    }

    public void setAtRate(double atRate) {
        this.atRate = atRate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}

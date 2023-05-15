package com.example.ticketingsystem;

import android.os.Bundle;

public class Ticket {

    private String driverName;
    private String licensePlate;
    private String violation;
    private String date;
    private String fineAmount;

    public Ticket(String driverName, String licensePlate, String violation, String date, String fineAmount) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.violation = violation;
        this.date = date;
        this.fineAmount = fineAmount;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getViolation() {
        return violation;
    }

    public String getDate() {
        return date;
    }

    public String getFineAmount() {
        return fineAmount;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("driverName", driverName);
        bundle.putString("licensePlate", licensePlate);
        bundle.putString("violation", violation);
        bundle.putString("date", date);
        bundle.putString("fineAmount", fineAmount);
        return bundle;
    }
}

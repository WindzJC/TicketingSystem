package com.example.ticketingsystem;

import java.util.Date;

public class Ticket {
    private String driverName;
    private String licensePlate;
    private String violation;
    private Date date;

    public Ticket(String driverName, String licensePlate, String violation, Date date) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.violation = violation;
        this.date = date;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

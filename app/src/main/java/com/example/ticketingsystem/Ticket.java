package com.example.ticketingsystem;

public class Ticket {
    private String driverName;
    private String licensePlate;
    private String violation;
    private String date;

    public Ticket(String name, String driverLicense, String driverName, String licensePlate, String violationDescription, String violationDate, double fineAmount) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.violation = violation;
        this.date = date;
    }

    public Ticket(String driverName, String driverLicense, String licensePlate, String violation) {
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

    public void setDriverName(String toString) {
    }

    public void setLicensePlate(String toString) {
    }

    public void setViolation(String toString) {
    }

    public void setDate(String toString) {
    }

    public void setFineAmount(double parseDouble) {
    }
}

package com.example.ticketingsystem;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewTicket extends AppCompatActivity {

    private TextView driverNameTextView;
    private TextView licensePlateTextView;
    private TextView violationTextView;
    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ticket);

        // Get references to the TextViews in the layout
        driverNameTextView = findViewById(R.id.driver_name_text_view);
        licensePlateTextView = findViewById(R.id.license_plate_text_view);
        violationTextView = findViewById(R.id.violation_text_view);
        dateTextView = findViewById(R.id.date_label_text_view);

        // Retrieve the Ticket object passed from the previous activity
        Ticket ticket = (Ticket) getIntent().getSerializableExtra("ticket");

        // Display the ticket information in the TextViews
        driverNameTextView.setText(ticket.getDriverName());
        licensePlateTextView.setText(ticket.getLicensePlate());
        violationTextView.setText(ticket.getViolation());
        dateTextView.setText(ticket.getDate());
    }
}

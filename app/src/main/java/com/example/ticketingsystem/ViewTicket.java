package com.example.ticketingsystem;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewTicket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ticket);

        TextView driverNameTextView = findViewById(R.id.driver_name_text_view);
        TextView licensePlateTextView = findViewById(R.id.license_plate_text_view);
        TextView violationTextView = findViewById(R.id.violation_text_view);
        TextView dateTextView = findViewById(R.id.date_label_text_view);

        driverNameTextView.setText("John Doe");
        licensePlateTextView.setText("ABC123");
        violationTextView.setText("Speeding");
        dateTextView.setText("May 15, 2023");
    }
}

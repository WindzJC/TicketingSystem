package com.example.ticketingsystem;

import android.content.Intent;
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
        TextView dateTextView = findViewById(R.id.date_text_view);
        TextView fineAmountTextView = findViewById(R.id.fine_amount_text_view);

        Intent intent = getIntent();
        String driverName = intent.getStringExtra("driverName");
        String licensePlate = intent.getStringExtra("licensePlate");
        String violation = intent.getStringExtra("violation");
        String date = intent.getStringExtra("date");
        String fineAmount = intent.getStringExtra("fineAmount");

        driverNameTextView.setText(driverName);
        licensePlateTextView.setText(licensePlate);
        violationTextView.setText(violation);
        dateTextView.setText(date);
        fineAmountTextView.setText(fineAmount);
    }
}

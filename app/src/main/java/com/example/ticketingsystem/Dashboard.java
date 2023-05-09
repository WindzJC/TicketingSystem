package com.example.ticketingsystem;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    private TextView welcomeText;
    private Button addTicketButton;
    private Button viewTicketsButton;
    private Button generateReportButton;
    private Button logoutButton;

    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Get the welcome text view and set its text to display the logged in user's name
        welcomeText = findViewById(R.id.welcome_text);
        String userName = getIntent().getStringExtra("userName");
        welcomeText.setText(getString(R.string.welcome_text, userName));

        // Get the add ticket, view tickets, generate report, and logout buttons and set their click listeners
        addTicketButton = findViewById(R.id.add_ticket_button);
        viewTicketsButton = findViewById(R.id.view_tickets_button);
        generateReportButton = findViewById(R.id.generate_report_button);
        logoutButton = findViewById(R.id.logout_button);

        addTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the AddTicketActivity when the add ticket button is clicked
                Intent intent = new Intent(Dashboard.this, AddTicket.class);
                startActivity(intent);
            }
        });

        viewTicketsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ViewTicketsActivity when the view tickets button is clicked
                Intent intent = new Intent(Dashboard.this, ViewTicket.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to the Login activity when the logout button is clicked
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

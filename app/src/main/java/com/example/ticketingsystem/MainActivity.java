package com.example.ticketingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Views
    private EditText driverNameEditText;
    private EditText driverLicenseEditText;
    private EditText vehicleInfoEditText;
    private EditText violationTypeEditText;
    private EditText violationDescriptionEditText;
    private EditText violationDateEditText;
    private EditText fineAmountEditText;
    private Button addTicketButton;
    private Button cancelButton;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by id
        driverNameEditText = findViewById(R.id.edit_text_driver_name);
        driverLicenseEditText = findViewById(R.id.edit_text_license_plate);
        violationTypeEditText = findViewById(R.id.edit_text_violation);
        violationDescriptionEditText = findViewById(R.id.edit_text_violation);
        violationDateEditText = findViewById(R.id.edit_text_violation);
        fineAmountEditText = findViewById(R.id.fine_amount_edittext);
        addTicketButton = findViewById(R.id.edit_ticket_title);
        cancelButton = findViewById(R.id.cancel_button);

        // Set click listener on add ticket button
        addTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from EditText fields
                String driverName = driverNameEditText.getText().toString().trim();
                String driverLicense = driverLicenseEditText.getText().toString().trim();
                String vehicleInfo = vehicleInfoEditText.getText().toString().trim();
                String violationType = violationTypeEditText.getText().toString().trim();
                String violationDescription = violationDescriptionEditText.getText().toString().trim();
                String violationDate = violationDateEditText.getText().toString().trim();
                String fineAmountString = fineAmountEditText.getText().toString().trim();

                // Validate inputs
                if (driverName.isEmpty() || driverLicense.isEmpty() || vehicleInfo.isEmpty()
                        || violationType.isEmpty() || violationDescription.isEmpty()
                        || violationDate.isEmpty() || fineAmountString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Convert fine amount to double
                double fineAmount = Double.parseDouble(fineAmountString);

                // Create new ticket object
                Ticket ticket = new Ticket(driverName, driverLicense, vehicleInfo,
                        violationType, violationDescription, violationDate, fineAmount);

                // TODO: Save ticket to database or send to server

                // Show success message
                Toast.makeText(MainActivity.this, "Ticket added successfully", Toast.LENGTH_SHORT).show();

                // Clear input fields
                driverNameEditText.getText().clear();
                driverLicenseEditText.getText().clear();
                vehicleInfoEditText.getText().clear();
                violationTypeEditText.getText().clear();
                violationDescriptionEditText.getText().clear();
                violationDateEditText.getText().clear();
                fineAmountEditText.getText().clear();
            }
        });

        // Set click listener on cancel button
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Clear input fields
                driverNameEditText.getText().clear();
                driverLicenseEditText.getText().clear();
                vehicleInfoEditText.getText().clear();
                violationTypeEditText.getText().clear();
                violationDescriptionEditText.getText().clear();
                violationDateEditText.getText().clear();
                fineAmountEditText.getText().clear();
            }
        });
    }
}

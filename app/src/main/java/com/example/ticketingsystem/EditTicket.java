package com.example.ticketingsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditTicket extends AppCompatActivity {

    private EditText driverNameEditText;
    private EditText licensePlateEditText;
    private EditText violationEditText;
    private EditText dateEditText;
    private EditText fineAmountEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ticket);

        // Get references to the EditText views
        driverNameEditText = findViewById(R.id.edit_text_driver_name);
        licensePlateEditText = findViewById(R.id.edit_text_license_plate);
        violationEditText = findViewById(R.id.edit_text_violation);
        dateEditText = findViewById(R.id.edit_text_date);
        fineAmountEditText = findViewById(R.id.fine_amount_edittext);

        // Get the ticket object from the intent
        Ticket ticket = getIntent().getParcelableExtra("ticket");

        // Populate the EditText views with the ticket data
        driverNameEditText.setText(ticket.getDriverName());
        licensePlateEditText.setText(ticket.getLicensePlate());
        violationEditText.setText(ticket.getViolation());
        dateEditText.setText(ticket.getDate());

        // Set up the Save Changes button
        Button saveChangesButton = findViewById(R.id.button_save_changes);
        saveChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the ticket object with the new data
                ticket.setDriverName(driverNameEditText.getText().toString());
                ticket.setLicensePlate(licensePlateEditText.getText().toString());
                ticket.setViolation(violationEditText.getText().toString());
                ticket.setDate(dateEditText.getText().toString());
                ticket.setFineAmount(Double.parseDouble(fineAmountEditText.getText().toString()));

                // Show a toast message to confirm that the changes were saved
                Toast.makeText(EditTicket.this, "Changes saved", Toast.LENGTH_SHORT).show();

                // Return to the previous activity
                finish();
            }
        });

        // Set up the Cancel button
        Button cancelButton = findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to the previous activity without saving changes
                finish();
            }
        });
    }
}

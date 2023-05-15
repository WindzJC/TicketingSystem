package com.example.ticketingsystem;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddTicket extends AppCompatActivity {

    private EditText driverNameEditText;
    private EditText licensePlateEditText;
    private EditText violationEditText;
    private EditText dateEditText;
    private Button saveButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addticket);

        driverNameEditText = findViewById(R.id.driver_name_edit_text);
        licensePlateEditText = findViewById(R.id.edit_text_license_plate);
        violationEditText = findViewById(R.id.edit_text_violation);
        dateEditText = findViewById(R.id.edit_text_date);
        saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String driverName = driverNameEditText.getText().toString().trim();
                String licensePlate = licensePlateEditText.getText().toString().trim();
                String violation = violationEditText.getText().toString().trim();
                String date = dateEditText.getText().toString().trim();

                if (driverName.isEmpty() || licensePlate.isEmpty() || violation.isEmpty() || date.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_LONG).show();
                } else {
                    // TODO: Save ticket data to database or other storage mechanism
                    Toast.makeText(getApplicationContext(), "Ticket added successfully", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });


    }
}

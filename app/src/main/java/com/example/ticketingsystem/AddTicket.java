package com.example.ticketingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTicket extends AppCompatActivity {

    private EditText driverNameEditText;
    private EditText licensePlateEditText;
    private EditText violationEditText;
    private EditText dateEditText;
    private EditText fineAmountEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addticket);

        driverNameEditText = findViewById(R.id.driver_name_edit_text);
        licensePlateEditText = findViewById(R.id.license_plate_edit_text);
        violationEditText = findViewById(R.id.violation_edit_text);
        dateEditText = findViewById(R.id.date_edit_text);
        fineAmountEditText = findViewById(R.id.fine_amount_edit_text);

        Button saveButton = findViewById(R.id.add_ticket_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String driverName = driverNameEditText.getText().toString();
                String licensePlate = licensePlateEditText.getText().toString();
                String violation = violationEditText.getText().toString();
                String date = dateEditText.getText().toString();
                String fineAmount = fineAmountEditText.getText().toString();

                Intent intent = new Intent(AddTicket.this, ViewTicket.class);
                intent.putExtra("driverName", driverName);
                intent.putExtra("licensePlate", licensePlate);
                intent.putExtra("violation", violation);
                intent.putExtra("date", date);
                intent.putExtra("fineAmount", fineAmount);
                startActivity(intent);
            }
        });
    }
}

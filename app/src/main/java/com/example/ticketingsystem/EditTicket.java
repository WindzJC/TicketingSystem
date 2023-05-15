package com.example.ticketingsystem;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditTicket extends AppCompatActivity {

    private EditText driverNameEditText;
    private EditText licensePlateEditText;
    private EditText violationEditText;
    private EditText dateEditText;
    private EditText fineAmountEditText;
    private Button saveChangesButton;
    private Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ticket);

        driverNameEditText = findViewById(R.id.edit_text_driver_name);
        licensePlateEditText = findViewById(R.id.edit_text_license_plate);
        violationEditText = findViewById(R.id.edit_text_violation);
        dateEditText = findViewById(R.id.edit_text_date);
        fineAmountEditText = findViewById(R.id.fine_amount_edittext);
        saveChangesButton = findViewById(R.id.button_save_changes);
        cancelButton = findViewById(R.id.cancel_button);

        saveChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implement save changes functionality
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

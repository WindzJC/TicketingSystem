package com.example.ticketingsystem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddTicket extends Fragment {

    private EditText driverNameEditText;
    private EditText licensePlateEditText;
    private EditText violationEditText;
    private EditText dateEditText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_addticket, container, false);

        driverNameEditText = root.findViewById(R.id.driver_name_edittext);
        licensePlateEditText = root.findViewById(R.id.driver_license_edittext);
        violationEditText = root.findViewById(R.id.violation_type_edittext);
        dateEditText = root.findViewById(R.id.violation_date_edittext);

        // Set the dateEditText to the current date
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date currentDate = new Date();
        dateEditText.setText(dateFormat.format(currentDate));

        Button addTicketButton = root.findViewById(R.id.add_ticket_button);
        addTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the values of the EditText fields
                String driverName = driverNameEditText.getText().toString().trim();
                String licensePlate = licensePlateEditText.getText().toString().trim();
                String violation = violationEditText.getText().toString().trim();
                String date = dateEditText.getText().toString().trim();

                // Validate the input
                if (driverName.isEmpty()) {
                    Toast.makeText(getContext(), "Please enter driver name", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (licensePlate.isEmpty()) {
                    Toast.makeText(getContext(), "Please enter license plate", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (violation.isEmpty()) {
                    Toast.makeText(getContext(), "Please enter violation", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Create a new Ticket object with the input values
                Ticket newTicket = new Ticket(driverName, licensePlate, violation, date);

                // Add the new ticket to the database or server
                // TODO: Add code to add ticket to the database or server

                // Clear the EditText fields
                driverNameEditText.setText("");
                licensePlateEditText.setText("");
                violationEditText.setText("");

                // Set the dateEditText to the current date
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date currentDate = new Date();
                dateEditText.setText(dateFormat.format(currentDate));

                // Show a success message
                Toast.makeText(getContext(), "Ticket added successfully", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}

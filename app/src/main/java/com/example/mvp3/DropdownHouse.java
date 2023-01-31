package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Collections;

public class DropdownHouse extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button confirmhouse;
    String[] users = { "I'm broke af (shared room)", "Studio", "1BHK", "2BHK", "3BHK","I'm super rich" };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown_house);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);

        confirmhouse = (Button) findViewById(R.id.ConfirmHouse);
        confirmhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlightActivity();
            }
        });

    }
    public void openFlightActivity(){
        Intent intent = new Intent(this, Flight.class);
        startActivity(intent);
    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected User: "+users[position] ,Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
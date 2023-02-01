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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;

public class Diet extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int minteger = 0;
    Button confirmhouse;
    String[] users = { "Vegan", "Vegetarian", "Pescatarian", "Omnivore", "Carnivore" };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

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
    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {
        minteger = minteger - 1;
        if(minteger<1){
            minteger=1;
        }
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }
    public void openFlightActivity(){
        Intent intent = new Intent(this, Vehicle.class);
        startActivity(intent);
    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected Type of Residence: "+users[position] ,Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
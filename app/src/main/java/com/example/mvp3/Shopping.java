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

public class Shopping extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int minteger = 0;
    int minteger2 = 0;
    Button confirmhouse;
    String[] users = { "I'm broke af (shared room)", "Studio", "1BHK", "2BHK", "3BHK","I'm super rich" };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

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
        if(minteger<0){
            minteger=0;
        }
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }

    public void increaseInteger2(View view) {
        minteger2 = minteger2 + 1;
        display2(minteger2);

    }public void decreaseInteger2(View view) {
        minteger2 = minteger2 - 1;
        if(minteger2<0){
            minteger2=0;
        }
        display2(minteger2);
    }

    private void display2(int number) {
        TextView displayInteger2 = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger2.setText("" + number);
    }

    public void openFlightActivity(){
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected Type of Diet "+users[position] ,Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
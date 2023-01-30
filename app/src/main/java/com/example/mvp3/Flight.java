package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;


import android.widget.TextView;

public class Flight extends AppCompatActivity {
    int minteger = 0;
    int minteger2 = 0;
    int minteger3 = 0;
    int minteger4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);
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
    public void increaseInteger3(View view) {
        minteger3 = minteger3 + 1;
        display3(minteger3);

    }public void decreaseInteger3(View view) {
        minteger3 = minteger3 - 1;
        if(minteger3<0){
            minteger3=0;
        }
        display3(minteger3);
    }

    private void display3(int number) {
        TextView displayInteger3 = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger3.setText("" + number);
    }
    public void increaseInteger4(View view) {
        minteger4 = minteger4 + 1;
        display4(minteger4);

    }public void decreaseInteger4(View view) {
        minteger4 = minteger4 - 1;
        if(minteger4<0){
            minteger4=0;
        }
        display4(minteger4);
    }

    private void display4(int number) {
        TextView displayInteger4 = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger4.setText("" + number);
    }
}


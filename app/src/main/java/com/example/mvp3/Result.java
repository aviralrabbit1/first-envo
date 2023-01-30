package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    Button confirmflight;


    TextView selectedNum, selectedTxt;
    NumberPicker numberPicker, textPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        confirmflight = (Button) findViewById(R.id.ConfirmFlight);
        confirmflight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDietActivity();
            }
        });


        selectedNum = (TextView) findViewById(R.id.selectNumber);
        selectedTxt = (TextView) findViewById(R.id.selectText);


        //Populate NumberPicker values from minimum and maximum value range
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

                selectedNum.setText("Selected Number : " + i1);

            }
        });


        //Populate NumberPicker values from String array values
        final String[] values = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "JellyBean", "Kitkat", "Lollipop", "Marshmallow", "Nougat", "Oreo"};

        textPicker.setMinValue(0);
        textPicker.setMaxValue(values.length - 1);
        textPicker.setDisplayedValues(values);
        textPicker.setWrapSelectorWheel(true);

        textPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

                selectedTxt.setText("Selected Text : " + values[i1]);

            }
        });
    }

    public void openDietActivity(){
        Intent intent = new Intent(this, Diet.class);
        startActivity(intent);
    }

}


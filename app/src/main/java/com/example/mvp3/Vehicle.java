package com.example.mvp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.Slider;

import java.text.NumberFormat;


public class Vehicle extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button confirmvehicle;
    final String[] users = {"Public transport","Bike/Scooter","Petrol car","Diesel","Gas car","Electric"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);

        confirmvehicle = (Button) findViewById(R.id.ConfirmVehicle);
        confirmvehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openDietActivity();}


        });

        Slider slider = (Slider) findViewById(R.id.kmsSlider);
        TextView howManyKms = findViewById(R.id.howmanykms);

        slider.setLabelFormatter(new LabelFormatter() {
            @NonNull
            @Override
            public String getFormattedValue(float value) {
                NumberFormat kms = NumberFormat.getNumberInstance();
                howManyKms.setText("Distance Travelled in one day: " + kms.format(value)+ " kms");

                return kms.format(value) + " kms";

            }
        });
    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), "Selected Type of Residence: "+users[position] ,Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

    public void openDietActivity(){
        Intent intent = new Intent(this, Shopping.class);
        startActivity(intent);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
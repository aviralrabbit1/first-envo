package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Diet extends AppCompatActivity {
    Button ToVehicle;
    Button dietRadioButtton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        ToVehicle = (Button) findViewById(R.id.ToVehicle);
        ToVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVehicleActivity();
            }
        });
    }
    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        dietRadioButtton = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,dietRadioButtton.getText(), Toast.LENGTH_SHORT).show();
        }

    }

    public void openVehicleActivity(){
        Intent intent = new Intent(this, Vehicle.class);
        startActivity(intent);
    }

//    public void onItemSelected(AdapterView<?> arg0, View view, int position, long id) {
//        position = radioGroup.getCheckedRadioButtonId();
//        dietRadioButtton = (RadioButton) findViewById(position);
//        Toast.makeText(this, "Selected User: "+dietRadioButtton.getText() ,Toast.LENGTH_SHORT).show();
//    }
}
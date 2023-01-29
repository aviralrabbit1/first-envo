package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Shopping extends AppCompatActivity {

    private Button secondact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        secondact = findViewById(R.id.buttontotwo);
        secondact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shopping.this,Result.class);
                startActivity(intent);
            }
        });
    }

    public void onRegisterBtnClick (View view){
        TextView no_of_clothes = findViewById(R.id.NoOfClothes);
        TextView lastname = findViewById(R.id.NoOfGadgets);

        EditText edit_no_of_clothes = findViewById(R.id.edit_no_of_clothes);
        EditText editLastName = findViewById(R.id.editLastName);
        // R(special class) = resources

        no_of_clothes.setText("First Name: " + edit_no_of_clothes.getText().toString());
        lastname.setText("Last name: " + editLastName.getText().toString());
    }
}
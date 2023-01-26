package com.example.mvp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRegisterBtnClick (View view){
        TextView firstname = findViewById(R.id.firstNameView);
        TextView lastname = findViewById(R.id.LastNameView);
        TextView gmail = findViewById(R.id.mailview);

        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editGmail);
        // R(special class) = resources

        firstname.setText("First Name: " + editFirstName.getText().toString());
        lastname.setText("Last name: " + editLastName.getText().toString());
        gmail.setText("Email: " + editEmail.getText().toString());
    }
}
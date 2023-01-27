package com.example.mvp3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class LoginActivity extends AppCompatActivity {
    Button RedirectToSignupPage;
    Button ActualLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RedirectToSignupPage = (Button) findViewById(R.id.RedirectToSignupPage);
        RedirectToSignupPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        ActualLogin = (Button) findViewById(R.id.ActualLogin);
        ActualLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent2 = new Intent(this, SignupActivity.class);
        startActivity(intent2);
    }
    public void openLoginActivity(){
        Intent intent3 = new Intent(this, DropdownCountry.class);
        startActivity(intent3);
    }


}

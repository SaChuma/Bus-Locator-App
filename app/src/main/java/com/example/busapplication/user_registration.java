package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class user_registration extends AppCompatActivity {

    Button Btn_regis;
    TextView Redirect_to_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        Btn_regis = (Button) findViewById(R.id.user_regis);
        Redirect_to_login = (TextView) findViewById(R.id.RedirectTologin);

        // set action to the button and textview

        Btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from registration to login
                Intent intent = new Intent(user_registration.this, user_login.class);
                startActivity(intent);
                finish();
            }
        });

        Redirect_to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from registration to login
                Intent intent = new Intent(user_registration.this, user_login.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
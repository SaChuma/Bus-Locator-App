package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class driver_login extends AppCompatActivity {

    Button Btn_Driver_login;
    TextView Signup_redirect_driver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        Btn_Driver_login = (Button) findViewById(R.id.driver_login);
        Signup_redirect_driver = (TextView) findViewById(R.id.SignUpRedirect);

        // set action to the button and and the textview
        // first driver_registration

        Signup_redirect_driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from login to registration page
                Intent intent = new Intent(driver_login.this, driver_registration.class);
                startActivity(intent);
                finish();
            }
        });

        Btn_Driver_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from the login to add bus info
                Intent intent = new Intent(driver_login.this, add_car.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
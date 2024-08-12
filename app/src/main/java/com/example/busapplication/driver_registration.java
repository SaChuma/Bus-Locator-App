package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class driver_registration extends AppCompatActivity {

    Button Btnregis;
    TextView add_car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registration);

        Btnregis = (Button) findViewById(R.id.Driver_regis);
        add_car = (TextView) findViewById(R.id.Redirect_to_add_car);


        // set the button and textview action

        Btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from the registration page  to login
                Intent intent = new Intent(driver_registration.this, driver_login.class);
                startActivity(intent);
                finish();
            }
        });

        add_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // from driver registration to driver login page
                Intent intent = new Intent(driver_registration.this, driver_login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
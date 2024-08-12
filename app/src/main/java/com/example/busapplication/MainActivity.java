package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button userButton = findViewById(R.id.user);
        Button driverButton = findViewById(R.id.driver);

        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle user button click, navigate to UserLoginActivity
                Intent intent = new Intent(MainActivity.this, user_login.class);
                startActivity(intent);
            }
        });

        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle driver button click, navigate to DriverLoginActivity
                Intent intent = new Intent(MainActivity.this, driver_login.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class user_login extends AppCompatActivity {

  private  Button BtnLogin;
  private  TextView Signup_Redirect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        BtnLogin = (Button) findViewById(R.id.login_user);
        Signup_Redirect = (TextView) findViewById(R.id.SignUpRedirectText);

        // set action to the button and and the textview
        // first user_registration

        Signup_Redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here we are going to have an intense that will take us to the registration page
                Intent intent = new Intent(user_login.this, user_registration.class);
                startActivity(intent);
                finish();

            }
        });

        // set the login button to direct to the maps or homepage

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // new intent to direct to the maps page
                Intent intent = new Intent(user_login.this, maps_page.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
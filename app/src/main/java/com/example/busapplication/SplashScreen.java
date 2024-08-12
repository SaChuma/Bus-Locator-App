package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.busapplication.MainActivity;

public class SplashScreen extends AppCompatActivity {
    ImageView Roadmap, Cariamge;
    TextView text1, text2;
    Animation Top_anim, Bottom_anim, Left_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Roadmap = findViewById(R.id.phone);
        Cariamge = findViewById(R.id.bus);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        Top_anim = AnimationUtils.loadAnimation(this, R.anim.topanim);
        Bottom_anim = AnimationUtils.loadAnimation(this, R.anim.bottomanime);
        Left_anim = AnimationUtils.loadAnimation(this, R.anim.leftanime);

        Roadmap.setAnimation(Top_anim);
        Cariamge.setAnimation(Left_anim);
        text1.setAnimation(Bottom_anim);
        text2.setAnimation(Bottom_anim);

        // Add a delay before transitioning to the main activity
        int splashDuration = 3000; // 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the main activity
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish(); // Close the splash activity
            }
        }, splashDuration);
    }
}

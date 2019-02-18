package com.shantokumarkuetgmail.mathcube;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //--------------------------------------------------------------//

        setContentView(R.layout.activity_splash_screen2);

        //-----------intenting to go to the next activity--------------------------//

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeScreen = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(homeScreen);
                finish();
            }
        }, SPLASH_TIME_OUT);  //the delay time---------------
    }

}

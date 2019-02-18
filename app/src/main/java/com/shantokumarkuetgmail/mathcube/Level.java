package com.shantokumarkuetgmail.mathcube;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.level;
import static com.shantokumarkuetgmail.mathcube.DatabaseHelper.DATABASE_NAME;

public class Level extends AppCompatActivity {

    public static int key;
    public static int levelCompleted = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Full Screen-------------------------

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //----------------------------------------//

        setContentView(R.layout.activity_level2);
    }

    //----------setting the key corresponding to the level selected and intenting to go to the next activity-----------------------//

    public void level1(View view) {
        key = 1;
        Intent test = new Intent(Level.this, Starting1.class);
        startActivity(test);
    }
    public void level2(View view) {
        key = 2;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level3(View view) {
        key = 3;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level4(View view) {
        key = 4;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level5(View view) {
        key = 5;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level6(View view) {
        key = 6;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level7(View view) {
        key = 7;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level8(View view) {
        key = 8;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level9(View view) {
        key = 9;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level10(View view) {
        key = 10;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level11(View view) {
        key = 11;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level12(View view) {
        key = 12;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level13(View view) {
        key = 13;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level14(View view) {
        key = 14;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level15(View view) {
        key = 15;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level16(View view) {
        key = 16;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level17(View view) {
        key = 17;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level18(View view) {
        key = 18;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level19(View view) {
        key = 19;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }
    public void level20(View view) {
        key = 20;
        if(levelCompleted >= key-1) {
            Intent test = new Intent(Level.this, Starting1.class);
            startActivity(test);
        }
        else {
            Toast.makeText(this, "Locked!!! \nYour target is level " + String.valueOf(levelCompleted+1), Toast.LENGTH_SHORT).show();
        }
    }




    //------------------------------------------------------------------------------------------------//




}

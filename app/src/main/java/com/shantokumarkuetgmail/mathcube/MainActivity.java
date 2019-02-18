package com.shantokumarkuetgmail.mathcube;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import static android.R.string.yes;
import static android.content.DialogInterface.*;
import static android.os.Build.VERSION_CODES.M;
import static com.shantokumarkuetgmail.mathcube.DatabaseHelper.DATABASE_NAME;
import static com.shantokumarkuetgmail.mathcube.R.id.play;

public class MainActivity extends Activity {

    DatabaseHelper myDb;
    public static int soundKey = 1;
    public Button soundButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);
        play(); //-----------playing the starting sound-----------------//
        insert(); //-----------inserting data into database if needed---------------//
        init(); //--------------onClickListerner for readmore button----------------//
        //set();
        init2();  //--------------onClickListerner for play button----------------//
        listen(); //--------------onClickListerner for speaker button----------------//
    }

    /*public void set() {
        Button soundButton = (Button) findViewById(R.id.speakerButton);
        if(soundKey == 1) {
            soundButton.setBackgroundResource(R.drawable.speakeron);
        }
        else {
            soundButton.setBackgroundResource(R.drawable.speakeroff);
        }
    }*/

    public static MediaPlayer sound = new MediaPlayer();

    public void play() {

        sound = MediaPlayer.create(this, R.raw.startingsound);
        sound.start();
        sound.setLooping(true);

    }

    public void pause() {
        sound.stop();
    }

    public void listen() {
        soundButton = (Button) findViewById(R.id.speakerButton);
        soundButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(soundKey == 1) {
                            soundKey = 0;
                            pause();
                            soundButton.setBackgroundResource(R.drawable.speakeroff);
                        }
                        else {
                            soundKey = 1;
                            play();
                            soundButton.setBackgroundResource(R.drawable.speakeron);
                        }
                    }
                }
        );
    }


    public Button b;


    public void init()
    {
        b = (Button) findViewById(R.id.readmore);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(MainActivity.this, ReadMore.class);
                startActivity(test);
            }
        });
    }

    public Button bb;

    public void init2()
    {
        bb = (Button) findViewById(R.id.play);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(MainActivity.this, Level.class);
                startActivity(test);
                pause();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        Button yes, no;
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setCancelable(true);
        final View view = getLayoutInflater().inflate(R.layout.exit_dialog, null);
        builder.setView(view);

        yes = (Button) view.findViewById(R.id.yesButton);
        no = (Button) view.findViewById(R.id.noButton);

        final AlertDialog alertDialog = builder.show();
        alertDialog.getWindow().setLayout(550, 315);


        yes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pause();
                        finish();
                    }
                }
        );


        no.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                }
        );

    }

    public void insert() {

        Cursor res = myDb.getAllData();

        if(res.getCount() == 0) {

            //Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

            myDb.insertData("13", "9", "1", "7", "2");
            myDb.insertData("*", "/", "-", "+", "*");
            myDb.insertData("4", "14", "8", "5", "1");
            myDb.insertData("+", "*", "-", "/", "+");
            myDb.insertData("7", "4", "2", "9", "10");

            myDb.insertData("4", "16", "2", "5", "8");
            myDb.insertData("*", "+", "/", "*", "-");
            myDb.insertData("1", "3", "5", "9", "7");
            myDb.insertData("/", "-", "*", "+", "-");
            myDb.insertData("9", "3", "6", "1", "5");

            myDb.insertData("5", "3", "1", "12", "4");
            myDb.insertData("/", "^", "+", "-", "*");
            myDb.insertData("7", "4", "2", "1", "12");
            myDb.insertData("+", "*", "-", "^", "/");
            myDb.insertData("8", "7", "12", "4", "1");

            myDb.insertData("7", "5", ".", "3", "2");
            myDb.insertData("-", ".", "+", "/", "-");
            myDb.insertData(".", "4", "5", "1", "2");
            myDb.insertData("+", ".", "*", "-", "+");
            myDb.insertData("8", ".", "7", "3", "2");

            myDb.insertData("3", ".", "4", ".", "1");
            myDb.insertData(".", "*", "*", "+", ".");
            myDb.insertData(".", "3", ".", "2", "5");
            myDb.insertData("+", ".", "-", ".", "*");
            myDb.insertData(".", "7", ".", "3", "2");

            myDb.insertData("18", "14", ".", "12", ".");
            myDb.insertData(".", "/", ".", "-", "*");
            myDb.insertData("25", ".", "15", "10", "5");
            myDb.insertData("+", "^", ".", "/", "+");
            myDb.insertData("7", ".", "2", "1", "1");

            myDb.insertData("8", "6", ".", "3", ".");
            myDb.insertData("+", "*", ".", "-", ".");
            myDb.insertData("5", "1", ".", "2", ".");
            myDb.insertData("-", "+", ".", "*", ".");
            myDb.insertData("3", "4", "7", ".", "2");

            myDb.insertData(".", ".", "5", "4", ".");
            myDb.insertData("+", ".", ".", ".", "*");
            myDb.insertData("8", ".", "4", ".", ".");
            myDb.insertData(".", "^", ".", "-", ".");
            myDb.insertData(".", "2", ".", "1", "2");

            myDb.insertData(".", "5", ".", ".", "4");
            myDb.insertData(".", "*", ".", "+", ".");
            myDb.insertData("1", ".", "18", ".", ".");
            myDb.insertData(".", "+", ".", "-", ".");
            myDb.insertData("7", ".", "5", "3", ".");

            myDb.insertData(".", ".", "3", ".", ".");
            myDb.insertData(".", "+", ".", ".", ".");
            myDb.insertData("5", ".", ".", "17", ".");
            myDb.insertData(".", ".", "*", ".", "-");
            myDb.insertData(".", "1", ".", "13", ".");


            myDb.insertData("13", "9", "1", "7", "2");
            myDb.insertData("*", "/", "-", "+", "*");
            myDb.insertData("4", "14", "8", "5", "1");
            myDb.insertData("+", "*", "-", "/", "+");
            myDb.insertData("7", "4", "2", "9", "10");

            myDb.insertData("4", "16", "2", "5", "8");
            myDb.insertData("*", "+", "/", "*", "-");
            myDb.insertData("1", "3", "5", "9", "7");
            myDb.insertData("/", "-", "*", "+", "-");
            myDb.insertData("9", "3", "6", "1", "5");

            myDb.insertData("5", "3", "1", "12", "4");
            myDb.insertData("/", "^", "+", "-", "*");
            myDb.insertData("7", "4", "2", "1", "12");
            myDb.insertData("+", "*", "-", "^", "/");
            myDb.insertData("8", "7", "12", "4", "1");

            myDb.insertData("7", "5", ".", "3", "2");
            myDb.insertData("-", ".", "+", "/", "-");
            myDb.insertData(".", "4", "5", "1", "2");
            myDb.insertData("+", ".", "*", "-", "+");
            myDb.insertData("8", ".", "7", "3", "2");

            myDb.insertData("3", ".", "4", ".", "1");
            myDb.insertData(".", "*", "*", "+", ".");
            myDb.insertData(".", "3", ".", "2", "5");
            myDb.insertData("+", ".", "-", ".", "*");
            myDb.insertData(".", "7", ".", "3", "2");

            myDb.insertData("18", "14", ".", "12", ".");
            myDb.insertData(".", "/", ".", "-", "*");
            myDb.insertData("25", ".", "15", "10", "5");
            myDb.insertData("+", "^", ".", "/", "+");
            myDb.insertData("7", ".", "2", "1", "1");

            myDb.insertData("8", "6", ".", "3", ".");
            myDb.insertData("+", "*", ".", "-", ".");
            myDb.insertData("5", "1", ".", "2", ".");
            myDb.insertData("-", "+", ".", "*", ".");
            myDb.insertData("3", "4", "7", ".", "2");

            myDb.insertData(".", ".", "5", "4", ".");
            myDb.insertData("+", ".", ".", ".", "*");
            myDb.insertData("8", ".", "4", ".", ".");
            myDb.insertData(".", "^", ".", "-", ".");
            myDb.insertData(".", "2", ".", "1", "2");

            myDb.insertData(".", "5", ".", ".", "4");
            myDb.insertData(".", "*", ".", "+", ".");
            myDb.insertData("1", ".", "18", ".", ".");
            myDb.insertData(".", "+", ".", "-", ".");
            myDb.insertData("7", ".", "5", "3", ".");

            myDb.insertData(".", ".", "3", ".", ".");
            myDb.insertData(".", "+", ".", ".", ".");
            myDb.insertData("5", ".", ".", "17", ".");
            myDb.insertData(".", ".", "*", ".", "-");
            myDb.insertData(".", "1", ".", "13", ".");
        }
    }

}

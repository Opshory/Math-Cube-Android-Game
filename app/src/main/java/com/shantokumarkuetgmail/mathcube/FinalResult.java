package com.shantokumarkuetgmail.mathcube;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.shantokumarkuetgmail.mathcube.R.id.left5;
import static com.shantokumarkuetgmail.mathcube.R.id.right2;
import static com.shantokumarkuetgmail.mathcube.R.id.right4;
import static com.shantokumarkuetgmail.mathcube.R.id.right5;

public class FinalResult extends AppCompatActivity {

    Button details, done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_final_result);

        details = (Button) findViewById(R.id.buttonDetails);
        done = (Button) findViewById( R.id.buttonDone );

        setValue();  //this function set the equations in the textViews an check the ans(right or wrong)
        Details();  //----------onClickListerner for details button-------------//
        Done();  //------------for going back to the  level activity-----------//
    }


    //------------for going back to the  level activity-----------//

    public void Done() {
        done.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( FinalResult.this, Level.class );
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity( intent );
            }
        } );
    }


    //----------onClickListerner for details button-------------//

    public void Details() {
        details.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        /*final AlertDialog.Builder builder = new AlertDialog.Builder(FinalResult.this);

                        builder.setCancelable(true);
                        final View view1 = getLayoutInflater().inflate(R.layout.activity_details_of_cube, null);
                        builder.setView(view1);

                        final AlertDialog alertDialog = builder.show();
                        alertDialog.getWindow().setLayout(600, 500);*/

                        Intent intent = new Intent(FinalResult.this, DetailsOfCube.class);
                        startActivity(intent);

                    }
                }
        );
    }


    //this function set the equations in the textViews an check the ans(right or wrong)


    public void setValue() {

        TextView textView = (TextView) findViewById(R.id.ansLeft);
        textView.setText(String.valueOf(Starting1.leftTotal));

        TextView textView1 = (TextView) findViewById(R.id.ansRight);
        textView1.setText(String.valueOf(Starting1.rightTotal));

        TextView left1 = (TextView) findViewById(R.id.left1);
        left1.setText(Starting1.leftEquations[0]);
        TextView left2 = (TextView) findViewById(R.id.left2);
        left2.setText(Starting1.leftEquations[1]);
        TextView left3 = (TextView) findViewById(R.id.left3);
        left3.setText(Starting1.leftEquations[2]);
        TextView left4 = (TextView) findViewById(R.id.left4);
        left4.setText(Starting1.leftEquations[3]);
        TextView left5 = (TextView) findViewById(R.id.left5);
        left5.setText(Starting1.leftEquations[4]);

        TextView right1 = (TextView) findViewById(R.id.right1);
        right1.setText(Starting1.rightEquations[0]);
        TextView right2 = (TextView) findViewById(R.id.right2);
        right2.setText(Starting1.rightEquations[1]);
        TextView right3 = (TextView) findViewById(R.id.right3);
        right3.setText(Starting1.rightEquations[2]);
        TextView right4 = (TextView) findViewById(R.id.right4);
        right4.setText(Starting1.rightEquations[3]);
        TextView right5 = (TextView) findViewById(R.id.right5);
        right5.setText(Starting1.rightEquations[4]);

        TextView finalAns = (TextView) findViewById(R.id.finalAns);
        ImageView rorw = (ImageView) findViewById(R.id.imagerorw);

        if(Starting1.result == Starting1.selection) {
            finalAns.setText("right answer");
            if(Level.levelCompleted < Level.key) {
                Level.levelCompleted = Level.key;
            }
            rorw.setImageResource(R.drawable.correct);
            finalAns.setBackgroundColor(Color.parseColor("green"));
            if(MainActivity.soundKey == 1) {
                MediaPlayer right = MediaPlayer.create(this, R.raw.correctans3);
                right.start();
            }
        }
        else {
            finalAns.setText("wrong answer");
            rorw.setImageResource(R.drawable.no);
            finalAns.setBackgroundColor(Color.parseColor("red"));
            if(MainActivity.soundKey == 1) {
                MediaPlayer wrong = MediaPlayer.create(this, R.raw.wrongans);
                wrong.start();
            }
        }
    }
}

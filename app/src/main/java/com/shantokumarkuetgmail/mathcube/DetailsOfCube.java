package com.shantokumarkuetgmail.mathcube;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class DetailsOfCube extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_details_of_cube);

        displayMain(); //passing the values to display the main cube-----------------//
        displayLeft();  //passing the values to display Left rotated cube-------------//
        displayRight();  //passing the values to display Right rotated cube-------------//
    }


    //passing the values to the display functions --------------------//

    public void displayMain() {

        display111(Starting1.matrixMain[1][1].toString());
        display112(Starting1.matrixMain[1][2].toString());
        display113(Starting1.matrixMain[1][3].toString());
        display114(Starting1.matrixMain[1][4].toString());
        display115(Starting1.matrixMain[1][5].toString());

        display121(Starting1.matrixMain[2][1].toString());
        display122(Starting1.matrixMain[2][2].toString());
        display123(Starting1.matrixMain[2][3].toString());
        display124(Starting1.matrixMain[2][4].toString());
        display125(Starting1.matrixMain[2][5].toString());

        display131(Starting1.matrixMain[3][1].toString());
        display132(Starting1.matrixMain[3][2].toString());
        display133(Starting1.matrixMain[3][3].toString());
        display134(Starting1.matrixMain[3][4].toString());
        display135(Starting1.matrixMain[3][5].toString());

        display141(Starting1.matrixMain[4][1].toString());
        display142(Starting1.matrixMain[4][2].toString());
        display143(Starting1.matrixMain[4][3].toString());
        display144(Starting1.matrixMain[4][4].toString());
        display145(Starting1.matrixMain[4][5].toString());

        display151(Starting1.matrixMain[5][1].toString());
        display152(Starting1.matrixMain[5][2].toString());
        display153(Starting1.matrixMain[5][3].toString());
        display154(Starting1.matrixMain[5][4].toString());
        display155(Starting1.matrixMain[5][5].toString());

    }

    public void displayLeft() {


        display211(Starting1.matrixLeft[1][1].toString());
        display212(Starting1.matrixLeft[1][2].toString());
        display213(Starting1.matrixLeft[1][3].toString());
        display214(Starting1.matrixLeft[1][4].toString());
        display215(Starting1.matrixLeft[1][5].toString());


        display221(Starting1.matrixLeft[2][1].toString());
        display222(Starting1.matrixLeft[2][2].toString());
        display223(Starting1.matrixLeft[2][3].toString());
        display224(Starting1.matrixLeft[2][4].toString());
        display225(Starting1.matrixLeft[2][5].toString());


        display231(Starting1.matrixLeft[3][1].toString());
        display232(Starting1.matrixLeft[3][2].toString());
        display233(Starting1.matrixLeft[3][3].toString());
        display234(Starting1.matrixLeft[3][4].toString());
        display235(Starting1.matrixLeft[3][5].toString());


        display241(Starting1.matrixLeft[4][1].toString());
        display242(Starting1.matrixLeft[4][2].toString());
        display243(Starting1.matrixLeft[4][3].toString());
        display244(Starting1.matrixLeft[4][4].toString());
        display245(Starting1.matrixRight[4][5].toString());


        display251(Starting1.matrixLeft[5][1].toString());
        display252(Starting1.matrixLeft[5][2].toString());
        display253(Starting1.matrixLeft[5][3].toString());
        display254(Starting1.matrixLeft[5][4].toString());
        display255(Starting1.matrixLeft[5][5].toString());
    }

    public void displayRight() {


        display311(Starting1.matrixRight[1][1].toString());
        display312(Starting1.matrixRight[1][2].toString());
        display313(Starting1.matrixRight[1][3].toString());
        display314(Starting1.matrixRight[1][4].toString());
        display315(Starting1.matrixRight[1][5].toString());


        display321(Starting1.matrixRight[2][1].toString());
        display322(Starting1.matrixRight[2][2].toString());
        display323(Starting1.matrixRight[2][3].toString());
        display324(Starting1.matrixRight[2][4].toString());
        display325(Starting1.matrixRight[2][5].toString());


        display331(Starting1.matrixRight[3][1].toString());
        display332(Starting1.matrixRight[3][2].toString());
        display333(Starting1.matrixRight[3][3].toString());
        display334(Starting1.matrixRight[3][4].toString());
        display335(Starting1.matrixRight[3][5].toString());


        display341(Starting1.matrixRight[4][1].toString());
        display342(Starting1.matrixRight[4][2].toString());
        display343(Starting1.matrixRight[4][3].toString());
        display344(Starting1.matrixRight[4][4].toString());
        display345(Starting1.matrixRight[4][5].toString());


        display351(Starting1.matrixRight[5][1].toString());
        display352(Starting1.matrixRight[5][2].toString());
        display353(Starting1.matrixRight[5][3].toString());
        display354(Starting1.matrixRight[5][4].toString());
        display355(Starting1.matrixRight[5][5].toString());
    }

    //---------------------------------------------------------------------//







    //Display functions for the three cubes are here--------------------------------//



    public void display111(String s) {
        TextView textView = (TextView) findViewById(R.id.text111);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display112(String s) {
        TextView textView = (TextView) findViewById(R.id.text112);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display113(String s) {
        TextView textView = (TextView) findViewById(R.id.text113);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display114(String s) {
        TextView textView = (TextView) findViewById(R.id.text114);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display115(String s) {
        TextView textView = (TextView) findViewById(R.id.text115);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display121(String s) {
        TextView textView = (TextView) findViewById(R.id.text121);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display122(String s) {
        TextView textView = (TextView) findViewById(R.id.text122);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display123(String s) {
        TextView textView = (TextView) findViewById(R.id.text123);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display124(String s) {
        TextView textView = (TextView) findViewById(R.id.text124);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display125(String s) {
        TextView textView = (TextView) findViewById(R.id.text125);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display131(String s) {
        TextView textView = (TextView) findViewById(R.id.text131);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display132(String s) {
        TextView textView = (TextView) findViewById(R.id.text132);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display133(String s) {
        TextView textView = (TextView) findViewById(R.id.text133);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display134(String s) {
        TextView textView = (TextView) findViewById(R.id.text134);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display135(String s) {
        TextView textView = (TextView) findViewById(R.id.text135);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display141(String s) {
        TextView textView = (TextView) findViewById(R.id.text141);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display142(String s) {
        TextView textView = (TextView) findViewById(R.id.text142);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display143(String s) {
        TextView textView = (TextView) findViewById(R.id.text143);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display144(String s) {
        TextView textView = (TextView) findViewById(R.id.text144);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display145(String s) {
        TextView textView = (TextView) findViewById(R.id.text145);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display151(String s) {
        TextView textView = (TextView) findViewById(R.id.text151);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display152(String s) {
        TextView textView = (TextView) findViewById(R.id.text152);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display153(String s) {
        TextView textView = (TextView) findViewById(R.id.text153);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display154(String s) {
        TextView textView = (TextView) findViewById(R.id.text154);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display155(String s) {
        TextView textView = (TextView) findViewById(R.id.text155);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }




















    public void display211(String s) {
        TextView textView = (TextView) findViewById(R.id.text211);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display212(String s) {
        TextView textView = (TextView) findViewById(R.id.text212);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display213(String s) {
        TextView textView = (TextView) findViewById(R.id.text213);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display214(String s) {
        TextView textView = (TextView) findViewById(R.id.text214);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display215(String s) {
        TextView textView = (TextView) findViewById(R.id.text215);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display221(String s) {
        TextView textView = (TextView) findViewById(R.id.text221);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display222(String s) {
        TextView textView = (TextView) findViewById(R.id.text222);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display223(String s) {
        TextView textView = (TextView) findViewById(R.id.text223);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display224(String s) {
        TextView textView = (TextView) findViewById(R.id.text224);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display225(String s) {
        TextView textView = (TextView) findViewById(R.id.text225);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display231(String s) {
        TextView textView = (TextView) findViewById(R.id.text231);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display232(String s) {
        TextView textView = (TextView) findViewById(R.id.text232);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display233(String s) {
        TextView textView = (TextView) findViewById(R.id.text233);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display234(String s) {
        TextView textView = (TextView) findViewById(R.id.text234);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display235(String s) {
        TextView textView = (TextView) findViewById(R.id.text235);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display241(String s) {
        TextView textView = (TextView) findViewById(R.id.text241);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display242(String s) {
        TextView textView = (TextView) findViewById(R.id.text242);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display243(String s) {
        TextView textView = (TextView) findViewById(R.id.text243);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display244(String s) {
        TextView textView = (TextView) findViewById(R.id.text244);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display245(String s) {
        TextView textView = (TextView) findViewById(R.id.text245);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display251(String s) {
        TextView textView = (TextView) findViewById(R.id.text251);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display252(String s) {
        TextView textView = (TextView) findViewById(R.id.text252);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display253(String s) {
        TextView textView = (TextView) findViewById(R.id.text253);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display254(String s) {
        TextView textView = (TextView) findViewById(R.id.text254);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display255(String s) {
        TextView textView = (TextView) findViewById(R.id.text255);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }























    public void display311(String s) {
        TextView textView = (TextView) findViewById(R.id.text311);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display312(String s) {
        TextView textView = (TextView) findViewById(R.id.text312);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display313(String s) {
        TextView textView = (TextView) findViewById(R.id.text313);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display314(String s) {
        TextView textView = (TextView) findViewById(R.id.text314);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display315(String s) {
        TextView textView = (TextView) findViewById(R.id.text315);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display321(String s) {
        TextView textView = (TextView) findViewById(R.id.text321);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display322(String s) {
        TextView textView = (TextView) findViewById(R.id.text322);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display323(String s) {
        TextView textView = (TextView) findViewById(R.id.text323);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display324(String s) {
        TextView textView = (TextView) findViewById(R.id.text324);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display325(String s) {
        TextView textView = (TextView) findViewById(R.id.text325);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display331(String s) {
        TextView textView = (TextView) findViewById(R.id.text331);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display332(String s) {
        TextView textView = (TextView) findViewById(R.id.text332);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display333(String s) {
        TextView textView = (TextView) findViewById(R.id.text333);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display334(String s) {
        TextView textView = (TextView) findViewById(R.id.text334);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display335(String s) {
        TextView textView = (TextView) findViewById(R.id.text335);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display341(String s) {
        TextView textView = (TextView) findViewById(R.id.text341);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display342(String s) {
        TextView textView = (TextView) findViewById(R.id.text342);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display343(String s) {
        TextView textView = (TextView) findViewById(R.id.text343);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display344(String s) {
        TextView textView = (TextView) findViewById(R.id.text344);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display345(String s) {
        TextView textView = (TextView) findViewById(R.id.text345);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display351(String s) {
        TextView textView = (TextView) findViewById(R.id.text351);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display352(String s) {
        TextView textView = (TextView) findViewById(R.id.text352);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display353(String s) {
        TextView textView = (TextView) findViewById(R.id.text353);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display354(String s) {
        TextView textView = (TextView) findViewById(R.id.text354);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display355(String s) {
        TextView textView = (TextView) findViewById(R.id.text355);
        if (s.equals(" ")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }


    //----------------------------------------------------------------------//




}

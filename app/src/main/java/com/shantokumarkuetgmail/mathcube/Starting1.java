package com.shantokumarkuetgmail.mathcube;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.key;

public class Starting1 extends AppCompatActivity {

    DatabaseHelper myDb;

    //Declaration of needed matrix and variables-----------------------//

    static String[][] matrix = new String[6][6];
    static String[][] matrixMain = new String[6][6];
    static String[][] matrixLeft = new String[6][6];
    static String[][] matrixRight = new String[6][6];
    static double[] left = new double[5];
    static double[] right = new double[5];
    static String[] leftEquations = new String[5];
    static String[] rightEquations = new String[5];
    static double leftTotal = 0;
    static double rightTotal = 0;
    static int selection = 0;
    static int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_starting1);
        myDb = new DatabaseHelper(this);
        getTable();
        check(); //----------------to find out the option selected by the user---------------//


    }

    public void check() {
        Button leftKey, middleKey, rightKey;

        leftKey = (Button) findViewById(R.id.buttonLeft);
        middleKey = (Button) findViewById(R.id.buttonBoth);
        rightKey = (Button) findViewById(R.id.buttonRight);

        leftKey.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        selection = 1;
                        Intent intent = new Intent(Starting1.this, FinalResult.class);
                        startActivity(intent);
                    }
                }
        );

        middleKey.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        selection = 2;
                        Intent intent = new Intent(Starting1.this, FinalResult.class);
                        startActivity(intent);
                    }
                }
        );

        rightKey.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        selection = 3;
                        Intent intent = new Intent(Starting1.this, FinalResult.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public void onBackPressed()
    {
        Button back, home, resume;
        final AlertDialog.Builder builder = new AlertDialog.Builder(Starting1.this);

        builder.setCancelable(true);
        final View view = getLayoutInflater().inflate(R.layout.alart_option, null);
        builder.setView(view);

        resume = (Button) view.findViewById(R.id.buttonResume);
        back = (Button) view.findViewById(R.id.buttonBack);

        final AlertDialog alertDialog = builder.show();
        alertDialog.getWindow().setLayout(600, 500);

        resume.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                }
        );

        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent test = new Intent(Starting1.this, Level.class);
                        test.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(test);
                    }
                }
        );



    }

    //-------------this function process the matrix, which is the pre and post positions of the data before and after the rotation---------//


    public void processMatrix() {

        String temp;

        left = new double[5];
        right = new double[5];
        leftEquations = new String[5];
        rightEquations = new String[5];


        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                matrixMain[i][j] = matrix[i][j];
            }
        }


        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(matrix[i][j] == null) {

                }
                else if(matrix[i][j].equals(".")) {
                    matrix[i][j] = " ";
                }
            }
        }

        for(int j = 2; j <= 5; j++) {
            for(int i = 1; i <= 5; i++) {
                for (int k = 1; k < j; k++) {
                    if(matrix[i][j] == null) {

                    }
                    else if(matrix[i][k] == null) {

                    }
                    else if (matrix[i][k].equals(" ")) {
                        matrix[i][k] = matrix[i][j];
                        matrix[i][j] = " ";
                        break;
                    }
                }
            }
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                matrixLeft[i][j] = matrix[j][5-i+1];
            }
        }

        leftTotal = 0;

        for(int i = 1; i <= 5; i++) {
            temp = "";
            if (matrix[1][i] != null) {
                temp = temp + matrix[1][i];
            }
            if (matrix[2][i] != null) {
                temp = temp + matrix[2][i];
            }
            if (matrix[3][i] != null) {
                temp = temp + matrix[3][i];
            }
            if (matrix[4][i] != null) {
                temp = temp + matrix[4][i];
            }
            if (matrix[5][i] != null) {
                temp = temp + matrix[5][i];
            }
            if (!temp.equals("     ")) {
                double x;
                x = round(eval(temp), 2);
                left[i-1] = x;
                leftTotal += x;
                String s;
                s = String.valueOf(x);
                leftEquations[i-1] = temp + " = " + s;
                //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }


        for(int j = 4; j >= 1; j--) {
            for(int i = 5; i >= 1; i--) {
                for (int k = 5; k > j; k--) {
                    if(matrix[i][j] == null) {

                    }
                    else if(matrix[i][k] == null) {

                    }
                    else if (matrix[i][k].equals(" ")) {
                        matrix[i][k] = matrix[i][j];
                        matrix[i][j] = " ";
                        break;
                    }
                }
            }
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                matrixRight[i][j] = matrix[5-j+1][i];
            }
        }

        rightTotal = 0;

        for(int i = 5; i >= 1; i--) {
            temp = "";
            if (matrix[5][i] != null) {
                temp = temp + matrix[5][i];
            }
            if (matrix[4][i] != null) {
                temp = temp + matrix[4][i];
            }
            if (matrix[3][i] != null) {
                temp = temp + matrix[3][i];
            }
            if (matrix[2][i] != null) {
                temp = temp + matrix[2][i];
            }
            if (matrix[1][i] != null) {
                temp = temp + matrix[1][i];
            }
            if (!temp.equals("     ")) {
                double x;
                x = round(eval(temp), 2);
                right[i-1] = x;
                rightTotal += x;
                String s;
                s = String.valueOf(x);
                rightEquations[i-1] = temp + " = " + s;
                //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }

        if(leftTotal > rightTotal) {
            result = 1;
        }
        else if(rightTotal > leftTotal) {
            result = 3;
        }
        else {
            result = 2;
        }

    }

    //----------------------------------------------------------------------//





    //-------------------funtion for rounding a double type data-----------------//




    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }






    //------------- function to evalute the string of equation---------------------//




    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }


    //getting the data from the database into the matrix here-----------------------//


    public void getTable() {
        Cursor res = myDb.getAllData();
        String s;
        while (res.moveToNext()) {

            for (int i = 0; i < (Level.key-1)*5; i++) {
                res.moveToNext();
            }

            //----------------------displaying the database elements------------------------//

            int i = 1;
            int j = 1;

            s = res.getString(1).toString();
            display11(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(2).toString();
            display12(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(3).toString();
            display13(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(4).toString();
            display14(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(5).toString();
            display15(s);
            matrix[i][j] = s;
            i++;
            j = 1;

            res.moveToNext();

            s = res.getString(1).toString();
            display21(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(2).toString();
            display22(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(3).toString();
            display23(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(4).toString();
            display24(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(5).toString();
            display25(s);
            matrix[i][j] = s;
            i++;
            j = 1;

            res.moveToNext();

            s = res.getString(1).toString();
            display31(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(2).toString();
            display32(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(3).toString();
            display33(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(4).toString();
            display34(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(5).toString();
            display35(s);
            matrix[i][j] = s;
            i++;
            j = 1;

            res.moveToNext();

            s = res.getString(1).toString();
            display41(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(2).toString();
            display42(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(3).toString();
            display43(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(4).toString();
            display44(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(5).toString();
            display45(s);
            matrix[i][j] = s;
            i++;
            j = 1;

            res.moveToNext();

            s = res.getString(1).toString();
            display51(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(2).toString();
            display52(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(3).toString();
            display53(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(4).toString();
            display54(s);
            matrix[i][j] = s;
            j++;
            s = res.getString(5).toString();
            display55(s);
            matrix[i][j] = s;

            for(i = 0; i < 6; i++) {
                matrix[i][0] = ".";
            }

            for(i = 1; i < 6; i++) {
                matrix[0][i] = ".";
            }


            processMatrix();

            break;

            //----------------------displaying the database elements------------------------//
        }
    }


    //------------------display functions---------------------//

    public void display11(String s) {
        TextView textView = (TextView) findViewById(R.id.text11);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display12(String s) {
        TextView textView = (TextView) findViewById(R.id.text12);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display13(String s) {
        TextView textView = (TextView) findViewById(R.id.text13);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display14(String s) {
        TextView textView = (TextView) findViewById(R.id.text14);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display15(String s) {
        TextView textView = (TextView) findViewById(R.id.text15);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display21(String s) {
        TextView textView = (TextView) findViewById(R.id.text21);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display22(String s) {
        TextView textView = (TextView) findViewById(R.id.text22);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display23(String s) {
        TextView textView = (TextView) findViewById(R.id.text23);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display24(String s) {
        TextView textView = (TextView) findViewById(R.id.text24);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display25(String s) {
        TextView textView = (TextView) findViewById(R.id.text25);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display31(String s) {
        TextView textView = (TextView) findViewById(R.id.text31);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display32(String s) {
        TextView textView = (TextView) findViewById(R.id.text32);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display33(String s) {
        TextView textView = (TextView) findViewById(R.id.text33);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display34(String s) {
        TextView textView = (TextView) findViewById(R.id.text34);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display35(String s) {
        TextView textView = (TextView) findViewById(R.id.text35);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display41(String s) {
        TextView textView = (TextView) findViewById(R.id.text41);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display42(String s) {
        TextView textView = (TextView) findViewById(R.id.text42);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display43(String s) {
        TextView textView = (TextView) findViewById(R.id.text43);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display44(String s) {
        TextView textView = (TextView) findViewById(R.id.text44);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display45(String s) {
        TextView textView = (TextView) findViewById(R.id.text45);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display51(String s) {
        TextView textView = (TextView) findViewById(R.id.text51);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display52(String s) {
        TextView textView = (TextView) findViewById(R.id.text52);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display53(String s) {
        TextView textView = (TextView) findViewById(R.id.text53);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display54(String s) {
        TextView textView = (TextView) findViewById(R.id.text54);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    public void display55(String s) {
        TextView textView = (TextView) findViewById(R.id.text55);
        if (s.equals(".")) {
            textView.setBackgroundColor(Color.parseColor("#00FF0000"));
            textView.setText("");
        } else {
            textView.setText(s);
        }
    }

    //--------------------display functios ends-----------------------//

}


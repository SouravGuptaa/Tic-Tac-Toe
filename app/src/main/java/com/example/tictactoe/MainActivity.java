package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    int turn = 0;
    int count = 0;
    String t1, t2, t3, t4, t5, t6, t7, t8, t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        initElements();
    }

    private void initElements() {
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);
        textView6 = findViewById(R.id.text6);
        textView7 = findViewById(R.id.text7);
        textView8 = findViewById(R.id.text8);
        textView9 = findViewById(R.id.text9);

    }

    public void tap(View view) {
        TextView tvCurrent = (TextView) view;
        if (tvCurrent.getText().toString().equals("")) {
            count++;
            if (turn == 0) {
                tvCurrent.setText("x");
                turn = 1;
            } else {
                tvCurrent.setText("o");
                turn = 0;
            }

            if (count > 4) {
                t1 = textView1.getText().toString();
                t2 = textView2.getText().toString();
                t3 = textView3.getText().toString();
                t4 = textView4.getText().toString();
                t5 = textView5.getText().toString();
                t6 = textView6.getText().toString();
                t7 = textView7.getText().toString();
                t8 = textView8.getText().toString();
                t9 = textView9.getText().toString();


                if (t1.equals(t2) && t2.equals(t3) && !t1.equals("")) {
                    Toast.makeText(this, "winner is " + t1, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t1.equals(t4) && t4.equals(t7) && !t1.equals("")) {
                    Toast.makeText(this, "winner is " + t1, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t1.equals(t5) && t5.equals(t9) && !t1.equals("")) {
                    Toast.makeText(this, "winner is " + t1, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t3.equals(t6) && t6.equals(t9) && !t3.equals("")) {
                    Toast.makeText(this, "winner is " + t3, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t3.equals(t5) && t5.equals(t7) && !t3.equals("")) {
                    Toast.makeText(this, "winner is " + t3, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t2.equals(t5) && t5.equals(t8) && !t2.equals("")) {
                    Toast.makeText(this, "winner is " + t2, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t4.equals(t5) && t5.equals(t6) && !t4.equals("")) {
                    Toast.makeText(this, "winner is " + t4, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (t7.equals(t8) && t8.equals(t9) && !t7.equals("")) {
                    Toast.makeText(this, "winner is " + t7, Toast.LENGTH_SHORT).show();
                    restart();

                } else {
                    rejoin();
                }
            }
        }

    }

    private void rejoin() {
        if (count==9){
            restart();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(MainActivity.this,"draw",Toast.LENGTH_SHORT).show();
                }
            },1000);
        }
    }

    private void restart() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                textView5.setText("");
                textView6.setText("");
                textView7.setText("");
                textView8.setText("");
                textView9.setText("");
                count = 0;
                turn=0;

            }
        },2000);

    }

}
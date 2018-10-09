package com.example.tlc.guessthenumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends Activity {

    //First random
    int rnd = ThreadLocalRandom.current().nextInt(10, 99 + 1);

    public boolean check()
    {
        TextView mainText = findViewById(R.id.textView01);
        TextView resultText = findViewById(R.id.Result);
        if(mainText.getText().toString().length()>1) {
            if(Integer.parseInt(mainText.getText().toString())> rnd){
                resultText.setText("- " + Integer.parseInt(mainText.getText().toString()));
            } else if (Integer.parseInt(mainText.getText().toString()) < rnd){
                resultText.setText("+ " + Integer.parseInt(mainText.getText().toString()));
            } else {
                resultText.setText("BRAVO : " + Integer.parseInt(mainText.getText().toString()));
                rnd = ThreadLocalRandom.current().nextInt(10, 99 + 1);
            }
            mainText.setText("");
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Display
        final TextView mainText = findViewById(R.id.textView01);
        final TextView resultText = findViewById(R.id.Result);
        //Controls
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btn0 = findViewById(R.id.button0);
        //region Buttons
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "1");
                check();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "2");
                check();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "3");
                check();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "4");
                check();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "5");
                check();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "6");
                check();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "7");
                check();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "8");
                check();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "9");
                check();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText() + "0");
                check();
            }
        });
        //endregion
    }
}

package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HelloActivity extends Activity {

    int count1, count2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        Button button1 = findViewById(R.id.button1);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("НАЖАТО!");
                count1=count1+1;

                text1.setText("Bottom 1 = " + count1);
            }
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setText("НАЖАТО!");
                count2=count2+1;

                text2.setText("Bottom 2 = " + count2);
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setText("НАЖАТО!");
                count1 = 0;
                count2 = 0;
                text1.setText("Bottom 1 = " + count1);
                text2.setText("Bottom 2 = " + count2);
            }
        });


    }

}

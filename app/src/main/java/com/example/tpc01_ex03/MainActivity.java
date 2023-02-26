package com.example.tpc01_ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_red;
    Button btn_green;
    Button btn_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_red = findViewById(R.id.btn_red);
        btn_green = findViewById(R.id.btn_green);
        btn_blue = findViewById(R.id.btn_blue);


        btn_red.setOnClickListener(view -> {
            btn_green.setEnabled(true);
            btn_blue.setEnabled(true);
            getWindow().getDecorView().setBackgroundColor(Color.RED);
            btn_red.setEnabled(false);
        });

        btn_green.setOnClickListener(view -> {
            btn_red.setEnabled(true);
            btn_blue.setEnabled(true);
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            btn_green.setEnabled(false);
        });

        btn_blue.setOnClickListener(view -> {
            btn_red.setEnabled(true);
            btn_green.setEnabled(true);
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            btn_blue.setEnabled(false);
        });

        if(!btn_red.isEnabled()){
            btn_red.setBackgroundColor(Color.RED);
        }else if(!btn_green.isEnabled()){
            btn_green.setBackgroundColor(Color.GREEN);
        }else if(!btn_blue.isEnabled()){
            btn_blue.setBackgroundColor(Color.BLUE);
        }

    }
}
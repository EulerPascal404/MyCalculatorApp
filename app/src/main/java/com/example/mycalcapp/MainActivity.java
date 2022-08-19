package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);

        double num1 = Double.parseDouble((input_1.getText().toString()));
        double num2 = Double.parseDouble((input_2.getText().toString()));
        double sum = num1 + num2;

        answer.setText("" + sum);
    }

}
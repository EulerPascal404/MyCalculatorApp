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
        if(input_1.getText().toString().isEmpty() || input_2.getText().toString().isEmpty()){
            answer.setText("Input needed");
            return;
        }
        double num1 = Double.parseDouble((input_1.getText().toString()));
        double num2 = Double.parseDouble((input_2.getText().toString()));
        double result= num1 + num2;
        answer.setText("" + result);
    }
    public void findDiff(View view) {
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        if(input_1.getText().toString().isEmpty() || input_2.getText().toString().isEmpty()){
            answer.setText("Input needed");
            return;
        }
        double num1 = Double.parseDouble((input_1.getText().toString()));
        double num2 = Double.parseDouble((input_2.getText().toString()));
        double result= num1 - num2;
        answer.setText("" + result);
    }
    public void findProduct(View view) {
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        if(input_1.getText().toString().isEmpty() || input_2.getText().toString().isEmpty()){
            answer.setText("Input needed");
            return;
        }
        double num1 = Double.parseDouble((input_1.getText().toString()));
        double num2 = Double.parseDouble((input_2.getText().toString()));
        double result= num1 * num2;
        answer.setText("" + result);
    }
    public void findQuotient(View view) {
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        if(input_1.getText().toString().isEmpty() || input_2.getText().toString().isEmpty()){
            answer.setText("Input needed");
            return;
        }
        double num1 = Double.parseDouble((input_1.getText().toString()));
        double num2 = Double.parseDouble((input_2.getText().toString()));
        double result= num1 / num2;
        answer.setText("" + result);
    }
    public void clearEntries(View view){
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        input_1.setText("");
        input_2.setText("");
        answer.setText("");
    }
    public void useAnswer(View view) {
        EditText input_1 = findViewById(R.id.number_1);
        TextView answer = findViewById(R.id.answer);
        if(input_1.getText().toString().isEmpty()){
            answer.setText("Make a calculation first");
            return;
        }
        double answer_val = Double.parseDouble((answer.getText().toString()));
        input_1.setText("" + answer_val);
    }
}
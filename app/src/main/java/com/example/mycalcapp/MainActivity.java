package com.example.mycalcapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int operation_status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findResult(View view){
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        if(operation_status == 0) {
            Toast.makeText(getApplicationContext(), "Select an operation first.", Toast.LENGTH_LONG).show();
        } else if (input_1.getText().toString().isEmpty() || input_2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Input needed", Toast.LENGTH_LONG).show();
        } else {
            double num1 = Double.parseDouble((input_1.getText().toString()));
            double num2 = Double.parseDouble((input_2.getText().toString()));
            double result = num1;
            if(operation_status == 1){
                result += num2;
            } else if(operation_status == 2){
                result -= num2;
            } else if(operation_status == 3){
                result *= num2;
            } else {
                result /= num2;
            }
            answer.setText("" + result);
        }
    }

    public void findSum(View view){
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        //recolor(this, plus, getResources().getColor(R.color.blue),R.drawable.my_border);
        operation_status = 1;
    }
    public void findDiff(View view){
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        // recolor(this, plus, getResources().getColor(R.color.blue),R.drawable.my_border);
        operation_status = 2;
    }
    public void findProduct(View view){
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        // recolor(this, plus, getResources().getColor(R.color.blue),R.drawable.my_border);
        operation_status = 3;
    }
    public void findQuotient(View view){
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);
        // recolor(this, plus, getResources().getColor(R.color.blue),R.drawable.my_border);
        operation_status = 4;
    }
    public void clearEntries(View view){
        EditText input_1 = findViewById(R.id.number_1);
        EditText input_2 = findViewById(R.id.number_2);
        TextView answer = findViewById(R.id.answer);
        input_1.setText("");
        input_2.setText("");
        answer.setText("");
        operation_status = 0;
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

    /**
     * Code attribution: https://stackoverflow.com/questions/61921805/android-change-background-of-an-xml-file-via-java-code
     */
    private void recolor(Context context, TextView textView, @ColorInt int color, int drawableResourceId) {
        Drawable unwrappedDrawable = AppCompatResources.getDrawable(context, drawableResourceId);
        if (unwrappedDrawable != null) {
            DrawableCompat.wrap(unwrappedDrawable);
            DrawableCompat.setTint(unwrappedDrawable, color);
            textView.setBackground(unwrappedDrawable);
        }

    }
}
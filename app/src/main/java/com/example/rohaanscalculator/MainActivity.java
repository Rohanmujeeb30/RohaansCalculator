package com.example.rohaanscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first,second;
    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.editTextNumber);
        second = findViewById(R.id.editTextNumber2);

        add = findViewById(R.id.addBtn);
        subtract = findViewById(R.id.subtractBtn);
        multiply = findViewById(R.id.multiplyBtn);
        divide = findViewById(R.id.divideBtn);

    }

    public void onSum(View view) {
        String a = first.getText().toString();
        String b = second.getText().toString();
        if(!a.equalsIgnoreCase("") && !b.equalsIgnoreCase("")){
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            Integer res = c + d;

            Toast.makeText(getApplicationContext(), "Result is:" + res, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_LONG).show();

        }
    }
    public void onSubtract(View view) {
        String a = first.getText().toString();
        String b = second.getText().toString();
        if(!a.equalsIgnoreCase("") && !b.equalsIgnoreCase("")){
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            int res = c - d;

            Toast.makeText(getApplicationContext(), "Result is:" + res, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_LONG).show();

        }
    }
    public void onMultiply(View view) {
        String a = first.getText().toString();
        String b = second.getText().toString();
        if(!a.equalsIgnoreCase("") && !b.equalsIgnoreCase("")){
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            int res = c * d;

            Toast.makeText(getApplicationContext(), "Result is:" + res, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_LONG).show();

        }

    }
    public void onDivide(View view) {
        String a = first.getText().toString();
        String b = second.getText().toString();
        if(!a.equalsIgnoreCase("") && !b.equalsIgnoreCase("")){
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            int res = c / d;

            Toast.makeText(getApplicationContext(), "Result is:" + res, Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_LONG).show();

        }
    }
}
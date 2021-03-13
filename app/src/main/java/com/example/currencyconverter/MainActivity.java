package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.currencyconverter.R.id.editTextTextPersonName;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = (EditText) findViewById(editTextTextPersonName);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        TextView textView = (TextView) findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                Log.i("MYTAG", string);
                int usd = Integer.parseInt(string);
                int UsdKurs = 83;
                int som = (usd * UsdKurs);
                textView.setText(String.valueOf(som));


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                int rub = Integer.parseInt(string);
                int RubKurs = 12;
                int som = (rub * RubKurs);
                textView.setText(String.valueOf(som));
             }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                int eur = Integer.parseInt(string);
                int EurKurs = 112;
                int som = (eur * EurKurs);
                textView.setText(String.valueOf(som));
            }
        });



    }
}
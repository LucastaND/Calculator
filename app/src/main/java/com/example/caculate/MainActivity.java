package com.example.caculate;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed_number1 = (EditText)findViewById(R.id.edittext_number1);
        EditText ed_number2 = (EditText)findViewById(R.id.edittext_number2);
        EditText ed_result = (EditText)findViewById(R.id.edittext_result);

        Button bt_add = (Button)findViewById(R.id.button_add);
        Button bt_subs = (Button)findViewById(R.id.button_subs);
        Button bt_divide = (Button)findViewById(R.id.button_divide);
        Button bt_multi = (Button)findViewById(R.id.button_multi);
        Button bt_mod = (Button)findViewById(R.id.button_mod);
        Button bt_n1n2 = (Button)findViewById(R.id.button_n1n2);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (TextUtils.isEmpty(ed_number1.getText().toString())) {
                        Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                    } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                        Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                    } else {
                        float n1 = Float.parseFloat(ed_number1.getText().toString());
                        float n2 = Float.parseFloat(ed_number2.getText().toString());
                        float add = n1 + n2;
                        ed_result.setText(String.valueOf(add));
                    }
            }
        });

        bt_subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( TextUtils.isEmpty(ed_number1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(ed_number1.getText().toString());
                    float n2 = Float.parseFloat(ed_number2.getText().toString());
                    float subs = n1 - n2;
                    ed_result.setText(String.valueOf(subs));
                }
            }
        });

        bt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(ed_number1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(ed_number1.getText().toString());
                    float n2 = Float.parseFloat(ed_number2.getText().toString());
                    if(n2 == 0){
                        Toast.makeText(MainActivity.this, "Number 2 must different from 0", Toast.LENGTH_SHORT).show();
                    }
                    float divide = n1 / n2;
                    ed_result.setText(String.valueOf(divide));
                }
            }
        });

        bt_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(ed_number1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(ed_number1.getText().toString());
                    float n2 = Float.parseFloat(ed_number2.getText().toString());
                    float multi = n1 * n2;
                    ed_result.setText(String.valueOf(multi));
                }
            }
        });

        bt_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(ed_number1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(ed_number1.getText().toString());
                    float n2 = Float.parseFloat(ed_number2.getText().toString());
                    float mod = n1 % n2;
                    ed_result.setText(String.valueOf(mod));
                }
            }
        });

        bt_n1n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(ed_number1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(ed_number2.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please input a value", Toast.LENGTH_SHORT).show();
                } else {
                    float n1 = Float.parseFloat(ed_number1.getText().toString());
                    float n2 = Float.parseFloat(ed_number2.getText().toString());
                    double n1n2 = Math.pow(n1, n2);
                    ed_result.setText(String.valueOf(n1n2));
                }
            }
        });


    }
}
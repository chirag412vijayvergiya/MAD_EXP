package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button bt_1, bt_2, bt_3, bt_4;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt_1 = findViewById(R.id.bt_1);
        bt_2 = findViewById(R.id.bt_2);
        bt_3 = findViewById(R.id.bt_3);
        bt_4 = findViewById(R.id.bt_4);
        et2 = findViewById(R.id.et1);
        et1 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(et1.getText().toString());
                int no2 = Integer.parseInt(et2.getText().toString());
                int no3 = no1 + no2;
                tv1.setText("Addition is " + Integer.toString(no3));
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(et1.getText().toString());
                int no2 = Integer.parseInt(et2.getText().toString());
                int no3 = no1 - no2;
                tv1.setText("Subtraction is " + Integer.toString(no3));
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(et1.getText().toString());
                int no2 = Integer.parseInt(et2.getText().toString());
                int no3 = no1 * no2;
                tv1.setText("Multiplication is " + Integer.toString(no3));
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(et1.getText().toString());
                int no2 = Integer.parseInt(et2.getText().toString());
                int no3;
                if(no2 > 0){
                     no3 = no1 / no2;
                }
                else{
                    no3 = -1000;
                }
                tv1.setText("Divide is " + Integer.toString(no3));
            }
        });
    }
}
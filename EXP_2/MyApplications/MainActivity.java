package com.example.myapplications;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    TextView tv1;

    Button bt_inc, bt_dec;
    int no1 = 0;

    @SuppressLint("MissingInflatedId")
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        bt_inc = findViewById(R.id.bt_inc);
        bt_dec = findViewById(R.id.bt_dec);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bt_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1++;
                tv1.setText(Integer.toString(no1));
                Toast.makeText(getApplicationContext(), "Value Incremented ", Toast.LENGTH_SHORT).show();
            }
        });

        bt_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(no1 > 0) {
                    no1--;
                    tv1.setText(Integer.toString(no1));
                    Toast.makeText(getApplicationContext(), "Value Decremented ", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Value can not be less than 0", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
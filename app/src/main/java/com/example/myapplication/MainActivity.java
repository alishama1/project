package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2;
    private TextView txt;
    private int x;
    private String result;
    boolean is=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        txt=findViewById(R.id.text);
        x=0;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                while (is) {
                    x += 5;
                    result=x+"";
                    txt.setText(result);


                }
            }

        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                is = false;
            }
        });




    }

}
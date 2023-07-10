package com.example.sepatu;

import static com.example.sepatu.R.*;
import static com.example.sepatu.R.id.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     Button button1;
    ImageView imageView;
    TextView edpass;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        
            setInitLayout();

    }
    private void setInitLayout(){
            imageView = findViewById(id.imageView);
            edpass = findViewById(id.edpass);
            button1 = findViewById(id.button1);
            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MenuUtama.class);
                    finish();
                    startActivity(intent);
                }
            });

    }
}
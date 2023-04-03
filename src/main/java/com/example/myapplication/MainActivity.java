package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button button1 = (Button)  findViewById(R.id.button1);
    Button button2 = (Button)  findViewById(R.id.button2);
    Button button3 = (Button)  findViewById(R.id.button3);
    Button button4 = (Button)  findViewById(R.id.button4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon);

        button1.setBackgroundColor(Color.BLUE);
        button1.setTextColor(Color.RED);
        button2.setBackgroundColor(Color.GREEN);
        button2.setTextColor(Color.YELLOW);
        button3.setBackgroundColor(Color.RED);
        button3.setTextColor(Color.BLUE);
        button4.setBackgroundColor(Color.YELLOW);
        button4.setTextColor(Color.GREEN);

        button1.setOnClickListener(v -> {

            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
            startActivity(mIntent);

        });

        button2.setOnClickListener(v -> {

            Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
        });

        button3.setOnClickListener(v -> {

            Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
        });

        button4.setOnClickListener(v -> finish());

    }
}
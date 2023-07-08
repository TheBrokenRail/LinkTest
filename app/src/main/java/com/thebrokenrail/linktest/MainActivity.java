package com.thebrokenrail.linktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import me.saket.bettermovementmethod.BetterLinkMovementMethod;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text_text);
        text.setMovementMethod(BetterLinkMovementMethod.getInstance());
    }
}
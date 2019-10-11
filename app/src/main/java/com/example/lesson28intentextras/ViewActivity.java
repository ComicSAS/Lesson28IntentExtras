package com.example.lesson28intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvView = findViewById(R.id.tvView);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");

        tvView.setText(String.format("User: %s %s", name, surname));
    }
}

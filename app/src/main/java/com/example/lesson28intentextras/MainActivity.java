package com.example.lesson28intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvName, tvSurname;

    Button btnSubmit;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.etFName);
        tvSurname = findViewById(R.id.etLName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this, ViewActivity.class);
        intent.putExtra("name", tvName.getText().toString());
        intent.putExtra("surname", tvSurname.getText().toString());
        startActivity(intent);
    }
}

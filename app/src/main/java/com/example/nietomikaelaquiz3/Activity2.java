package com.example.nietomikaelaquiz3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void showMainActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displayUser(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", MODE_PRIVATE);
        Toast.makeText(this, sp.getString("email", ""), Toast.LENGTH_SHORT).show();
    }

}

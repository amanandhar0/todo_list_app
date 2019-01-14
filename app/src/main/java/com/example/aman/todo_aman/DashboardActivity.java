package com.example.aman.todo_aman;

import android.annotation.SuppressLint;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        @SuppressLint("WrongConstant")SharedPreferences pref=getSharedPreferences("usname",MODE_PRIVATE);
        String username=pref.getString("android:username","");
        String password=pref.getString("android:password","");
        TextView displayusername=findViewById(R.id.disuname);
        displayusername.setText(username);
        TextView displaypassword=findViewById(R.id.dispassword);
        displaypassword.setText(password);
    }
}

package com.example.aman.todo_aman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView heading;
    private TextView detail;
    private TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        heading = findViewById(R.id.heading);
        detail = findViewById(R.id.detail);
        time = findViewById(R.id.time);

        Intent intent = getIntent();

        String heading=intent.getExtras().get("heading").toString();
        String detail=intent.getExtras().get("detail").toString();
        String time=intent.getExtras().get("time").toString();

//        heading.setText(heading);
        this.heading.setText(heading);
        this.detail.setText(detail);
        this.time.setText(time);
    }
}

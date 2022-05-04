package com.example.gonaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Requirements extends AppCompatActivity {

    private View backbttn_reqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requirements);

        Button backbttn_reqs = (Button)findViewById(R.id.backbttn_reqs);

        backbttn_reqs.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Requirements.this, Dashboard.class));
            }
        });
    }
}
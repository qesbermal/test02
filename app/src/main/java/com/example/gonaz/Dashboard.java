package com.example.gonaz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    ImageButton iv_requirements;
    ImageButton iv_enrollment;
    ImageButton iv_calendar;
    ImageButton iv_payment;
    ImageButton iv_contact;
    ImageButton iv_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        iv_requirements = findViewById(R.id.iv_requirements);
        iv_requirements.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, Requirements.class));
        });
        iv_enrollment = findViewById(R.id.iv_enrollment);
        iv_enrollment.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, Enrollment.class));
        });
        iv_calendar = findViewById(R.id.iv_calendar);
        iv_calendar.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, Calendar.class));
        });
        iv_payment = findViewById(R.id.iv_payment);
        iv_payment.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, Payment.class));
        });
        iv_contact = findViewById(R.id.iv_contact);
        iv_contact.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, ContactUs.class));
        });
        iv_about = findViewById(R.id.iv_about);
        iv_about.setOnClickListener(view ->{
            startActivity(new Intent(Dashboard.this, AboutUs.class));
        });

    }
}
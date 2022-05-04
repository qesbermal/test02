package com.example.gonaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button backbttn_payment = (Button)findViewById(R.id.backbttn_payment);

        backbttn_payment.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Payment.this, Dashboard.class));
            }


        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, ImageUpload.class);
        startActivity(intent);
        Button button = (Button) findViewById(R.id.uploadimagebttn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
}





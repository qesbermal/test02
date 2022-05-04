package com.example.gonaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }


    public void open(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/nazarethchristianschool"));
        startActivity(browserIntent);
    }
    public void openig(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/nazarethchristianschool"));
        startActivity(browserIntent);
    }
        public void openyt(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/nazarethchristianschool"));
            startActivity(browserIntent);
        }
    public void openmp(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ecKqtu3LJVJoXcKG8"));
        startActivity(browserIntent);
    }
}

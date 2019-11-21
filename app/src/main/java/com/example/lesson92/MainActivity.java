package com.example.lesson92;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivityButtons(View button) {
        Intent intent = new Intent(this, ButtonsActivity.class);
        startActivity(intent);
    }

    public void openActivityRadio(View button) {
        Intent intent = new Intent(this, RadioActivity.class);
        startActivity(intent);
    }
    public void openActivityUrlRL(View button) {
        Intent intent = new Intent(this, UrlActivityRL.class);
        startActivity(intent);
    }
    public void openActivityOverlap(View button) {
        Intent intent = new Intent(this, OverlapActivity.class);
        startActivity(intent);
    }
    public void openActivityUrlTL(View button) {
        Intent intent = new Intent(this, UrlActivityTL.class);
        startActivity(intent);
    }
    public void openActivityScrollView(View button) {
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }


}

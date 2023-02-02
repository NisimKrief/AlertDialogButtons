package com.example.alertdialogbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Credits
 */
public class MainActivity2 extends AppCompatActivity {
    Intent gi = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Finish(View view) {
        finish();
    }
}
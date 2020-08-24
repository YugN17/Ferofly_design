package com.example.feroflydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt=findViewById(R.id.button);
        ;
    }

    public void orderbutton(View view) {
        Intent intent= new Intent(this,OrderActivity.class);
        startActivity(intent);
    }
}
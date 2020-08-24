package com.example.feroflydesign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kofigyan.stateprogressbar.StateProgressBar;

import java.util.Objects;

public class OrderActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TextView officeaddr;
    private Button btt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_log));
        String[] descriptionData = {"Cooking", "Picked", "On way", "Delivered","Done"};
        toolbar=findViewById(R.id.toolbar_log);
        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);
        getSupportActionBar().setTitle("Order details");

        officeaddr=findViewById(R.id.address);
        final Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode((String) officeaddr.getText()));

        btt=findViewById(R.id.traack_order);
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, mapUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });




    }



    }

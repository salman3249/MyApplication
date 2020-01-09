package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viewContractorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contractor_profile);
    }

    public void editContractorProfile (View view)
    {
        Intent intent = new Intent(this, editContractorProfile.class);
        startActivity(intent);
    }
}

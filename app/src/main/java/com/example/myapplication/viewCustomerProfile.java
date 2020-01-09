package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viewCustomerProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_customer_profile);
    }
    public void editCustomerProfile (View view)
    {
        Intent intent = new Intent(this, editCustomerProfile.class);
        startActivity(intent);
    }
}

package com.example.caguillon.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        //intent; what do we pass?
        String username = getIntent().getStringExtra("username");
    }
    //Still have to send back data


}

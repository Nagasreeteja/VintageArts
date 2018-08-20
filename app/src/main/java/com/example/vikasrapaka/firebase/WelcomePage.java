package com.example.vikasrapaka.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }
    public void sketches(View v){
        Intent s= new Intent(WelcomePage.this,PostListActivity.class);
        startActivity(s);
    }
    public void paintingsclick(View v){
        Intent p = new Intent(WelcomePage.this,Sketches.class);
        startActivity(p);
    }
}
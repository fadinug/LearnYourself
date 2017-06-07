package com.example.fajar.learnyourself.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.R;

public class MainActivity extends AppCompatActivity {

    //deklarasi variable
    TextView name;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Learn by Yourself");

        //inisialisasi variable
        name = (TextView) findViewById(R.id.nametxt);
        start = (Button) findViewById(R.id.startbtn);

        //menerima intent dari class welcome
        String nameedit = getIntent().getStringExtra("name");
        name.setText("Hi, " + nameedit + ". Welcome to the Learn by Yourself! ");
    }

    public void startbtn (View view) {
        Intent start = new Intent(MainActivity.this, Menu.class);
        startActivity(start);
        finish();
    }
}

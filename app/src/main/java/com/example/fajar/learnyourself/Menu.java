package com.example.fajar.learnyourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setTitle("Home");
    }

    public void javaimgbtn (View view) {
        Intent java = new Intent(Menu.this, JavaActivity.class);
        startActivity(java);
    }

    public void phpimgbtn (View view) {
        Intent php = new Intent(Menu.this, PHPActivity.class);
        startActivity(php);
    }

    public void pythonimgbtn (View view) {
        Intent python = new Intent(Menu.this, PythonActivity.class);
        startActivity(python);
    }

    public void sqlimgbtn (View view) {
        Intent sql = new Intent(Menu.this, SQLActivity.class);
        startActivity(sql);
    }
}

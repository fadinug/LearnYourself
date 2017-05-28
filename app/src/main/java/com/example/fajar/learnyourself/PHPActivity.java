package com.example.fajar.learnyourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PHPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);

        setTitle("PHP Programming");
    }

    public void quizbtn (View view) {
        Intent quiz = new Intent(PHPActivity.this, PHPQuiz.class);
        startActivity(quiz);
    }

    public void menubtn (View view) {
        Intent menu = new Intent(PHPActivity.this, Menu.class);
        menu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(menu);
    }
}

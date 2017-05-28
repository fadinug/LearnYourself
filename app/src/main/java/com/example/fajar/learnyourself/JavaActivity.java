package com.example.fajar.learnyourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        setTitle("Java Programming");
    }

    public void quizbtn (View view) {
        Intent quiz = new Intent(JavaActivity.this, JavaQuiz.class);
        startActivity(quiz);
    }

    public void menubtn (View view) {
        Intent menu = new Intent(JavaActivity.this, Menu.class);
        menu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(menu);
    }
}

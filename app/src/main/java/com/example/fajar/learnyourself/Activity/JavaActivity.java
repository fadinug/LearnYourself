package com.example.fajar.learnyourself.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.Quiz.JavaQuiz;
import com.example.fajar.learnyourself.R;
import com.example.fajar.learnyourself.RecyclerView.MateriAdapter;
import com.example.fajar.learnyourself.RecyclerView.MateriModel;

import java.util.ArrayList;
import java.util.List;

public class JavaActivity extends AppCompatActivity {

    RecyclerView rv_java;
    List<MateriModel> materiList = new ArrayList<>();
    MateriAdapter materiAdapter;
    MateriModel materiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        setTitle("Java Programming");

        rv_java = (RecyclerView) findViewById(R.id.rv_java);
        materiAdapter = new MateriAdapter(getApplicationContext(), materiList);
        RecyclerView.LayoutManager lm_java = new LinearLayoutManager(getApplicationContext());
        rv_java.setLayoutManager(lm_java);
        rv_java.setItemAnimator(new DefaultItemAnimator());
        rv_java.setAdapter(materiAdapter);

        materi();
    }

    private void tambah_materi(int icon, String title, String intro, String content) {
        materiModel = new MateriModel(icon, title, intro, content);
        materiList.add(materiModel);
    }

    private void materi() {
        tambah_materi(R.drawable.java, "Welcome to Java",
                "Java is high level, modern programming language designed in the early 1990s by " +
                        "Sun Microsystems and currently owned by Oracle. Java is Platforms " +
                        "Independent, which means that you only need to write the program once to.",
                "More than 3 billion devices run Java. Java is used to develop apps for Google's" +
                        " Android OS, various Desktop Applications, such as media players, " +
                        "antivirus programs, Web Applications, Enterprise Applications (i.e " +
                        "banking) and many more!");
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

package com.example.fajar.learnyourself.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.Quiz.PythonQuiz;
import com.example.fajar.learnyourself.R;
import com.example.fajar.learnyourself.RecyclerView.MateriAdapter;
import com.example.fajar.learnyourself.RecyclerView.MateriModel;

import java.util.ArrayList;
import java.util.List;

public class PythonActivity extends AppCompatActivity {

    RecyclerView rv_Python;
    List<MateriModel> materiList = new ArrayList<>();
    MateriAdapter materiAdapter;
    MateriModel materiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        setTitle("Python Programming");

        rv_Python = (RecyclerView) findViewById(R.id.rv_python);
        materiAdapter = new MateriAdapter(getApplicationContext(), materiList);
        RecyclerView.LayoutManager lm_Python = new LinearLayoutManager(getApplicationContext());
        rv_Python.setLayoutManager(lm_Python);
        rv_Python.setItemAnimator(new DefaultItemAnimator());
        rv_Python.setAdapter(materiAdapter);

        materi();
    }

    private void tambah_materi(int icon, String title, String intro, String content) {
        materiModel = new MateriModel(icon, title, intro, content);
        materiList.add(materiModel);
    }

    private void materi() {
        tambah_materi(R.drawable.python, "Welcome to Python",
                "Python is a high-level programming language, with applications in numerous " +
                        "areas, including web programming, scripting, scientific computing, and " +
                        "artificial intelligence. It is very popular and used by organizations " +
                        "such as Google, NASA, the CIA, and Disney.",
                "The three major versions of Python are 1.x, 2.x and 3.x. These are subdivided " +
                        "into minor versions, such as 2.7 and 3.3. Code written for Python 3.x" +
                        " is guaranteed to work in all future versions. Both Python Version 2.x " +
                        "and 3.x are used currently. This course covers Python 3.x, but it isn't" +
                        " hard to change from one version to another. Python has several" +
                        " different implementations, written in various languages. The version " +
                        "used in this course, CPython, is the most popular by far.");
    }
    
    public void quizbtn (View view) {
        Intent quiz = new Intent(PythonActivity.this, PythonQuiz.class);
        startActivity(quiz);
    }
    
    public void menubtn (View view) {
        Intent menu = new Intent(PythonActivity.this, Menu.class);
        menu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(menu);
    }
}

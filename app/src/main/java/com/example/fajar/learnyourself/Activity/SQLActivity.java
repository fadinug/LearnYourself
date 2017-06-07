package com.example.fajar.learnyourself.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.Quiz.SQLQuiz;
import com.example.fajar.learnyourself.R;
import com.example.fajar.learnyourself.RecyclerView.MateriAdapter;
import com.example.fajar.learnyourself.RecyclerView.MateriModel;

import java.util.ArrayList;
import java.util.List;

public class SQLActivity extends AppCompatActivity {

    RecyclerView rv_sql;
    List<MateriModel> materiList = new ArrayList<>();
    MateriAdapter materiAdapter;
    MateriModel materiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        setTitle("SQL Programming");
        
        rv_sql = (RecyclerView) findViewById(R.id.rv_sql);
        materiAdapter = new MateriAdapter(getApplicationContext(), materiList);
        RecyclerView.LayoutManager lm_sql = new LinearLayoutManager(getApplicationContext());
        rv_sql.setLayoutManager(lm_sql);
        rv_sql.setItemAnimator(new DefaultItemAnimator());
        rv_sql.setAdapter(materiAdapter);

        materi();
    }

    private void tambah_materi(int icon, String title, String intro, String content) {
        materiModel = new MateriModel(icon, title, intro, content);
        materiList.add(materiModel);
    }

    private void materi() {
        tambah_materi(R.drawable.sql, "Welcome to SQL",
                "A database is a collection of data that is organized in a manner that " +
                        "facilitates ease of access, as well as efficient management and " +
                        "updating. A database is made up of tables that store relevant " +
                        "information. For example, you would use a database, if you were to " +
                        "create a website like YouTube, which contains a lot of information " +
                        "like videos, usernames, passwords, comments.",
                "A table stores and displays data in a structured format consisting of columns " +
                        "and rows that are similar to those seen in Excel spreadsheets. " +
                        "Databases often contain multiple tables, each designed for a specific" +
                        " purpose. For example, imagine creating a database table of names and " +
                        "telephone numbers.");
    }
    
    public void quizbtn (View view) {
        Intent quiz = new Intent(SQLActivity.this, SQLQuiz.class);
        startActivity(quiz);
    }

    public void menubtn (View view) {
        Intent menu = new Intent(SQLActivity.this, Menu.class);
        menu.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(menu);
    }
}

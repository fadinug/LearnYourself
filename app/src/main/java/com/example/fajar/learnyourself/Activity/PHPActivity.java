package com.example.fajar.learnyourself.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.Quiz.PHPQuiz;
import com.example.fajar.learnyourself.R;
import com.example.fajar.learnyourself.RecyclerView.MateriAdapter;
import com.example.fajar.learnyourself.RecyclerView.MateriModel;

import java.util.ArrayList;
import java.util.List;

import static com.example.fajar.learnyourself.R.drawable.php;

public class PHPActivity extends AppCompatActivity {

    RecyclerView rv_php;
    List<MateriModel> materiList = new ArrayList<>();
    MateriAdapter materiAdapter;
    MateriModel materiModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);

        setTitle("PHP Programming");
        rv_php = (RecyclerView) findViewById(R.id.rv_php);
        materiAdapter = new MateriAdapter(getApplicationContext(), materiList);
        RecyclerView.LayoutManager lm_php = new LinearLayoutManager(getApplicationContext());
        rv_php.setLayoutManager(lm_php);
        rv_php.setItemAnimator(new DefaultItemAnimator());
        rv_php.setAdapter(materiAdapter);

        materi();
    }

    private void tambah_materi(int icon, String title, String intro, String content) {
        materiModel = new MateriModel(icon, title, intro, content);
        materiList.add(materiModel);
    }

    private void materi() {
        tambah_materi(php, "Welcome to PHP",
                "PHP: Hypertext Preprocessor (PHP) is a free, highly popular, open source " +
                        "scripting language. PHP scripts are executed on the server.\n" +
                        "Just a short list of what PHP is capable of:\n" +
                        "- Generating dynamic page content\n" +
                        "- Creating, opening, reading, writing, deleting, and closing files on " +
                        "the server\n" +
                        "- Collecting form data\n" +
                        "- Adding, deleting, and modifying information stored in your database\n" +
                        "- controlling user-access\n" +
                        "- encrypting data\n" +
                        "- and much more!\"\n",
                "PHP runs on numerous, varying platforms, including Windows, Linux, Unix, Mac " +
                        "OS X, and so on. PHP is compatible with almost any modern server, such" +
                        " as Apache, IIS, and more. PHP supports a wide range of databases. PHP " +
                        "is free!");
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

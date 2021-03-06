package com.example.fajar.learnyourself.Quiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fajar.learnyourself.Menu;
import com.example.fajar.learnyourself.QuizBank.JavaQuizBank;
import com.example.fajar.learnyourself.R;

public class JavaQuiz extends AppCompatActivity {

    //deklarasi variable
    private JavaQuizBank mJavaQuizLibrary = new JavaQuizBank(); //buat wadah baru
    private TextView sQuestion;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;

    private String sAnswer; //bakal diambil untuk jawaban
    private int mQuestionNumber = 0; //mengatur nomor pertanyaan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz);

        setTitle("Quiz Java");

        //inisialisasi komponen di xml ke java
        sQuestion = (TextView) findViewById(R.id.question);
        mChoice1 = (Button) findViewById(R.id.choice1);
        mChoice2 = (Button) findViewById(R.id.choice2);
        mChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();
    }

    //method untuk update pertanyaan
    private void updateQuestion() {
        if (mQuestionNumber < mJavaQuizLibrary.getLength()) {
            sQuestion.setText(mJavaQuizLibrary.getSquestion(mQuestionNumber));
            mChoice1.setText(mJavaQuizLibrary.getSchoice(mQuestionNumber, 1));
            mChoice2.setText(mJavaQuizLibrary.getSchoice(mQuestionNumber, 2));
            mChoice3.setText(mJavaQuizLibrary.getSchoice(mQuestionNumber, 3));
            sAnswer = mJavaQuizLibrary.getScorrect(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(JavaQuiz.this, "This is last question", Toast.LENGTH_SHORT).show();
            lastquestion();
        }
    }

    //method ketika button opsi diklik
    public void onclick (View view) {
        Button answer = (Button) view;
        if (answer.getText() == sAnswer) {
            Toast.makeText(JavaQuiz.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(JavaQuiz.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        updateQuestion();
    }

    //method ketika pertanyaan terakhir sudah dijawab
    public void lastquestion() {
        new AlertDialog.Builder(JavaQuiz.this).setTitle("Go to Home")
                .setMessage("Do you want to go Home Activity?").setNegativeButton(android.R.string.no, null) // dismisses by default
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent home = new Intent(JavaQuiz.this, Menu.class);
                        startActivity(home);
                        finish();
                    }
                }).show();
    }
}

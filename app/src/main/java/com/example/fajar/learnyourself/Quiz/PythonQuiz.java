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
import com.example.fajar.learnyourself.QuizBank.PythonQuizBank;
import com.example.fajar.learnyourself.R;

public class PythonQuiz extends AppCompatActivity {

    //deklarasi variable
    private PythonQuizBank mPythonQuizLibrary = new PythonQuizBank(); //buat wadah baru
    private TextView sQuestion;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;

    private String sAnswer; //bakal diambil untuk jawaban
    private int mQuestionNumber = 0; //mengatur nomor pertanyaan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_quiz);

        setTitle("Quiz Python");

        //inisialisasi komponen di xml ke java
        sQuestion = (TextView) findViewById(R.id.question);
        mChoice1 = (Button) findViewById(R.id.choice1);
        mChoice2 = (Button) findViewById(R.id.choice2);
        mChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();
    }

    //method untuk update pertanyaan
    private void updateQuestion() {
        if (mQuestionNumber < mPythonQuizLibrary.getLength()) {
            sQuestion.setText(mPythonQuizLibrary.getSquestion(mQuestionNumber));
            mChoice1.setText(mPythonQuizLibrary.getSchoice(mQuestionNumber, 1));
            mChoice2.setText(mPythonQuizLibrary.getSchoice(mQuestionNumber, 2));
            mChoice3.setText(mPythonQuizLibrary.getSchoice(mQuestionNumber, 3));
            sAnswer = mPythonQuizLibrary.getScorrect(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(PythonQuiz.this, "This is last question", Toast.LENGTH_SHORT).show();
            lastquestion();
        }
    }

    //method ketika button opsi diklik
    public void onclick (View view) {
        Button answer = (Button) view;
        if (answer.getText() == sAnswer) {
            Toast.makeText(PythonQuiz.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(PythonQuiz.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        updateQuestion();
    }

    //method ketika pertanyaan terakhir sudah dijawab
    public void lastquestion() {
        new AlertDialog.Builder(PythonQuiz.this).setTitle("Go to Home")
                .setMessage("Do you want to go Home Activity?").setNegativeButton(android.R.string.no, null) // dismisses by default
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent home = new Intent(PythonQuiz.this, Menu.class);
                        startActivity(home);
                        finish();
                    }
                }).show();
    }
}

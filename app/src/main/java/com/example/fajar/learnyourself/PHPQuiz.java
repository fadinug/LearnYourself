package com.example.fajar.learnyourself;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PHPQuiz extends AppCompatActivity {

    //deklarasi variable
    private PHPQuizBank mPHPQuizLibrary = new PHPQuizBank(); //buat wadah baru
    private TextView sQuestion;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;

    private String sAnswer; //bakal diambil untuk jawaban
    private int mQuestionNumber = 0; //mengatur nomor pertanyaan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phpquiz);

        setTitle("Quiz PHP");

        //inisialisasi komponen di xml ke java
        sQuestion = (TextView) findViewById(R.id.question);
        mChoice1 = (Button) findViewById(R.id.choice1);
        mChoice2 = (Button) findViewById(R.id.choice2);
        mChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();
    }

    //method untuk update pertanyaan
    private void updateQuestion() {
        if (mQuestionNumber < mPHPQuizLibrary.getLength()) {
            sQuestion.setText(mPHPQuizLibrary.getSquestion(mQuestionNumber));
            mChoice1.setText(mPHPQuizLibrary.getSchoice(mQuestionNumber, 1));
            mChoice2.setText(mPHPQuizLibrary.getSchoice(mQuestionNumber, 2));
            mChoice3.setText(mPHPQuizLibrary.getSchoice(mQuestionNumber, 3));
            sAnswer = mPHPQuizLibrary.getScorrect(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(PHPQuiz.this, "This is last question", Toast.LENGTH_SHORT).show();
            lastquestion();
        }
    }

    //method ketika button opsi diklik
    public void onclick (View view) {
        Button answer = (Button) view;
        if (answer.getText() == sAnswer) {
            Toast.makeText(PHPQuiz.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(PHPQuiz.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        updateQuestion();
    }

    //method ketika pertanyaan terakhir sudah dijawab
    public void lastquestion() {
        new AlertDialog.Builder(PHPQuiz.this).setTitle("Go to Home")
                .setMessage("Do you want to go Home Activity?").setNegativeButton(android.R.string.no, null) // dismisses by default
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent home = new Intent(PHPQuiz.this, Menu.class);
                        startActivity(home);
                        finish();
                    }
                }).show();
    }
}

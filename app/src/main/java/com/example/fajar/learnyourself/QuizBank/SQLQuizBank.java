package com.example.fajar.learnyourself.QuizBank;

/**
 * Created by Fajar on 5/18/2017.
 */

public class SQLQuizBank {

    //array untuk pertanyaan
    private String squestion [] = {
            "Which of the following is NOT true about a database?",
            "Tables are made up of ..."
    };

    //array untuk opsi
    private String schoice [][] = {
            {"A database is a collection of data", "A database is made up of 'tables'", "A database is a programming language"},
            {"Columns and rows", "Columns only", "Rows, but no columns"}
    };

    //array untuk jawaban yang benar
    private String scorrect [] = {
            "A database is a programming language",
            "Columns and rows"
    };

    //method untuk mengetahui berapa pertanyaan
    public int getLength() {
        return squestion.length;
    }

    //method untuk mengembalikan pertanyaan dari array
    public String getSquestion(int a) {
        String question = squestion[a];
        return question;
    }

    //method untuk mengembalikan opsi dari array
    public String getSchoice(int index, int num) {
        String choice = schoice[index][num-1];
        return choice;
    }

    //method untuk mengembalikan jawaban dari array
    public String getScorrect(int a) {
        String correct = scorrect[a];
        return correct;
    }

}

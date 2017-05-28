package com.example.fajar.learnyourself;

/**
 * Created by Fajar on 5/18/2017.
 */

public class PythonQuizBank {

    //array untuk pertanyaan
    private String squestion [] = {
            "Python is a ... ",
            "Which of these statements is true?"
    };

    //array untuk opsi
    private String schoice [][] = {
            {"Development environment", "Set of editing tools", "Programming language"},
            {"Python code must be always compiled", "CPython is an implementation of Python", "Python 1.7 is the most widely used version"}
    };

    //array untuk jawaban yang benar
    private String scorrect [] = {
            "Programming language",
            "CPython is an implementation of Python"
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

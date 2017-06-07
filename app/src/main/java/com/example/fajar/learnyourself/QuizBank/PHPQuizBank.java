package com.example.fajar.learnyourself.QuizBank;

/**
 * Created by Fajar on 5/18/2017.
 */

public class PHPQuizBank {

    //array untuk pertanyaan
    private String squestion [] = {
            "PHP is a ...",
            "Can you run PHP on Linux?"
    };

    //array untuk opsi
    private String schoice [][] = {
            {"Server side programming language", "Markup language", "Home page"},
            {"Yes", "No", "Maybe"}
    };

    //array untuk jawaban yang benar
    private String scorrect [] = {
            "Server side programming language",
            "Yes"
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

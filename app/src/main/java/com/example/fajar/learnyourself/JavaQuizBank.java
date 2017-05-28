package com.example.fajar.learnyourself;

    /**
     * Created by Fajar on 5/18/2017.
     */

    public class JavaQuizBank {

        //array untuk pertanyaan
        private String squestion [] = {
                "To distribute your application to different platforms, how many Java versios do you need to create?",
                "Which one of the following statements is true?"
        };

        //array untuk opsi
        private String schoice [][] = {
                {"One for each platform", "Two versions", "Just one version"},
                {"Java is used only in web and mobile applications", "Java is used only in NASA's space related applications", "Java has a huge developer community"}
        };

        //array untuk jawaban yang benar
        private String scorrect [] = {
                "Just one version",
                "Java has a huge developer community"
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

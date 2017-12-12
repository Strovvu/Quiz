package com.example.opilane.quiz;


public class Questions {

    //array of questions
    public String MyQuestions [] = {
            "Mitu päeva on detsembris aastas 2017?",
            "Mis tarkvara kasutab Iphone?",
            "Mitu tähte on eesti tähestikus?",
            "Mitu kuud on aastas?",
            "Mitu linna on Eestis?"
    };

    //array of multiple choices for each question
    private String MyChoices [] [] = {
            {"31", "30", "32", "29"},
            {"Windows", "Android", "Linux", "IOS"},
            {"32", "23", "43", "54"},
            {"10", "9", "12", "5"},
            {"15", "12", "35", "33"}
    };
    //array of correct answers - in the same order as array of questions
    private String MyCorrectAnswers [] = {
            "30", "IOS", "32", "12", "33"
    };
    //method returns number of questions
    public int getLength() {
        return MyQuestions.length;
    }
    //method returns question from array MyQuestions[] based on array index
    public String getQuestion(int a) {
        String question = MyQuestions[a];
        return question;
    }
    // method returns a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0= MyChoices[index][num -1];
        return choice0;
    }
    //method returns correct answer for the question based on array index
    public String getCorrectAnswer (int a) {
        String answer= MyCorrectAnswers[a];
        return answer;
    }
}



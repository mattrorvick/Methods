package com.company;

public class Main {

    //this is a method, named main
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //Create a method called displayHighScorePosition
        //it should take players name as parameter and 2nd parameter as a position in high score table
        //you should display players name along with message like "managed to get into position" and the
        //position they got and a further message "on the high score table"

        //create 2nd method called calculateHighScorePosition
        //should be sent one argument only, the player score
        //it should return an int
        //the return data should be
        // 1 if score is >=1000
        // 2 if score is >=500 and <1000
        // 3 if score is >=100 and <500
        // 4 in all other cases
        //call both methods and display the result of the following
        // a score of 1500, 900, 400, and 50

        int positionInTable = calculateHighScorePosition(1500);
        displayHighScorePosition("Matt", positionInTable);

        positionInTable = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", positionInTable);

        positionInTable = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", positionInTable);

        positionInTable = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", positionInTable);

        positionInTable = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", positionInTable);

        positionInTable = calculateHighScorePosition(500);
        displayHighScorePosition("Ben", positionInTable);

        positionInTable = calculateHighScorePosition(100);
        displayHighScorePosition("Rick", positionInTable);

    }
    // void doesn't return anything
    public static void displayHighScorePosition(String playerName, int positionInTable) {
        System.out.println(playerName + " managed to get into position " + positionInTable + " on the high score table.");
    }

    // must return an int
    public static int calculateHighScorePosition(int pS) {

//        if (pS >= 1000) {
//            return 1;
//        } else if (pS >= 500) {
//            return 2;
//        } else if (pS >= 100) {
//            return 3;
//        }
//
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if(pS >= 1000) {
            position = 1;
        } else if (pS >= 500) {
            position = 2;
        } else if (pS >= 100) {
            position = 3;
        }
        return position;

    }

    //this is a method, named calculateScore
    //void doesn't return any information

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
}

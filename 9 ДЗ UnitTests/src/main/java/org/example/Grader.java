package org.example;

public class Grader {

    public char determineLetterGrade(int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Grade can't be negative");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else if (numberGrade < 100) {
            return 'A';
        }
        else {
            throw new IllegalArgumentException("Grade can't be higher than 100");
        }

    }
}

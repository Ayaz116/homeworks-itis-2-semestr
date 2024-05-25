package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraderTest {

    @Test
    public void negativeIsProblem(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });
    }
    @Test
    public void fiftyIsF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(50));
    }
    @Test
    public void sixtyIsD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }
    @Test
    public void seventyIsC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }
    @Test
    public void EightyIsB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }
    @Test
    public void ninetyIsA(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }
    @Test
    public void moreThanHundredIsProblem(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(101);
                });
    }

}
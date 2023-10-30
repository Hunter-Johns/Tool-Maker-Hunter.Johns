package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignmentsCheckerTest {

    @Test
    public void testForA(){
        AssignmentsChecker assignmentsChecker = new AssignmentsChecker();
        Assertions.assertEquals('A', AssignmentsChecker.assignmentGrader(7));
    }
    @Test
    public void testForB(){
        AssignmentsChecker assignmentsChecker = new AssignmentsChecker();
        Assertions.assertEquals('B', AssignmentsChecker.assignmentGrader(6));
    }
    @Test
    public void testForC(){
        AssignmentsChecker assignmentsChecker = new AssignmentsChecker();
        Assertions.assertEquals('C', AssignmentsChecker.assignmentGrader(5));
    }
    @Test
    public void testForD(){
        AssignmentsChecker assignmentsChecker = new AssignmentsChecker();
        Assertions.assertEquals('D', AssignmentsChecker.assignmentGrader(4));
    }
    @Test
    public void testForF(){
        AssignmentsChecker assignmentsChecker = new AssignmentsChecker();
        Assertions.assertEquals('F', AssignmentsChecker.assignmentGrader(3));
    }
}
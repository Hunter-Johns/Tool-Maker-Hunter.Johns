package edu.bsu.cs222;

public class AssignmentsChecker {
    public static char assignmentGrader(int numAssignmentsComplete){
        if (numAssignmentsComplete > 6){
            return 'A';
        }
        else if (numAssignmentsComplete > 5){
            return 'B';
        }
        else if (numAssignmentsComplete > 4){
            return 'C';
        }
        else if (numAssignmentsComplete > 3){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}

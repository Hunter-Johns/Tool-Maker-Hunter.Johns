package edu.bsu.cs222;

public class FinalExamChecker {

    public static char finalExamGrader (int specificationGrade) {
        if (specificationGrade > 2) {
            return 'A';
        }
        if (specificationGrade > 1) {
            return 'C';
        }
        else {
            return 'D';
        }
    }
}

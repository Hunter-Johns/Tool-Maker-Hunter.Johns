package edu.bsu.cs222;

public class ProjectsChecker {

    public static char finalProjectGrader (char finalIterationGrade, char otherIterationGrades){
        if (finalIterationGrade == 'A'){
            if (remainingProjectsGrader(otherIterationGrades)){
                return 'A';
            }
            else {
                return 'B';
            }
        }
        else if (finalIterationGrade == 'B'){
            return 'B';
        }
        else if (finalIterationGrade == 'C'){
            return 'C';
        }
        else if (finalIterationGrade == 'D'){
            return 'D';
        }
        else {
            return 'F';
        }

    }

    public static boolean remainingProjectsGrader (char otherIterationsGrades) {
        return otherIterationsGrades != 'F';
    }

}

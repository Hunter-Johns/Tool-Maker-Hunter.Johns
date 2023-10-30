package edu.bsu.cs222;

public class GradeComparisonTool {

    public static char findMinGrade (char assignmentGrade, char achievementGrade, char selfAssessmentGrade, char projectGrade, char finalExamGrade){
        char minimumGrade = assignmentGrade;

        if (achievementGrade > minimumGrade) {
            minimumGrade = achievementGrade;
        }
        if (selfAssessmentGrade > minimumGrade) {
            minimumGrade = selfAssessmentGrade;
        }
        if (projectGrade > minimumGrade) {
            minimumGrade = projectGrade;
        }
        if (finalExamGrade > minimumGrade) {
            minimumGrade = finalExamGrade;
        }

        return minimumGrade;
    }
}

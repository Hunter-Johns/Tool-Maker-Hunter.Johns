package edu.bsu.cs222;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Please insert the number of Assignments you have met specifications for. ");
        int numAssignmentsComplete = InputCollector.intInputRetriever();
        System.out.println("Please insert the number of Achievements you have met specifications for. ");
        int numAchievementsComplete = InputCollector.intInputRetriever();
        System.out.println("Did you meet full specifications for the Mid-semester self-assessment report? (1 for yes, 0 for no)");
        boolean metFullSpecifications;
        metFullSpecifications = InputCollector.intInputRetriever() == 1;
        System.out.println("Please insert the grade you received on Final Project Iteration 3. ");
        char finalIterationGrade = InputCollector.charInputRetriever();
        System.out.println("Please insert the worst grade you received on all other projects. ");
        char otherIterationGrades = InputCollector.charInputRetriever();
        System.out.println("For the Final exam, please enter 3 if you met full specifications, 2 if you met minimum specifications, and 1 if you did not meet minimum specifications. ");
        int specificationGrade = InputCollector.intInputRetriever();

        char achievements = (AchievementsChecker.achievementGrader(numAchievementsComplete));
        char assignments = (AssignmentsChecker.assignmentGrader(numAssignmentsComplete));
        char selfAssessmentReport = (SelfAssessmentReportChecker.reportGrader(metFullSpecifications));
        char finalProject = (ProjectsChecker.finalProjectGrader(finalIterationGrade, otherIterationGrades));
        char finalExam = (FinalExamChecker.finalExamGrader(specificationGrade));

        System.out.println("You will receive a(n): " + GradeComparisonTool.findMinGrade(achievements, assignments, selfAssessmentReport, finalProject, finalExam) + "At the end of the year.");
    }
}
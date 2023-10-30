package edu.bsu.cs222;

public class SelfAssessmentReportChecker {

    public static char reportGrader (boolean metFullSpecifications){
        if (metFullSpecifications){
            return 'A';
        }
        else {
            return 'D';
        }
    }
}

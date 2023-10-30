package edu.bsu.cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelfAssessmentReportCheckerTest {
    @Test
    public void testForA(){
        SelfAssessmentReportChecker selfAssessmentReportChecker = new SelfAssessmentReportChecker();
        Assertions.assertEquals('A', SelfAssessmentReportChecker.reportGrader(true));
    }
    @Test
    public void testForD(){
        SelfAssessmentReportChecker selfAssessmentReportChecker = new SelfAssessmentReportChecker();
        Assertions.assertEquals('D', SelfAssessmentReportChecker.reportGrader(false));
    }
}

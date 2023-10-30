package edu.bsu.cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalExamCheckerTest {
    @Test
    public void testForA(){
        FinalExamChecker finalExamChecker = new FinalExamChecker();
        Assertions.assertEquals('A', FinalExamChecker.finalExamGrader(3));
    }
    @Test
    public void testForC(){
        FinalExamChecker finalExamChecker = new FinalExamChecker();
        Assertions.assertEquals('C', FinalExamChecker.finalExamGrader(2));
    }
    @Test
    public void testForD(){
        FinalExamChecker finalExamChecker = new FinalExamChecker();
        Assertions.assertEquals('D', FinalExamChecker.finalExamGrader(1));
    }
}

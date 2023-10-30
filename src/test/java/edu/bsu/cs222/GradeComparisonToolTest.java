package edu.bsu.cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeComparisonToolTest {
    @Test
    public void testForA(){
        GradeComparisonTool gradeComparisonTool = new GradeComparisonTool();
        Assertions.assertEquals('A', GradeComparisonTool.findMinGrade('A','A','A','A','A'));
    }
    @Test
    public void testForB(){
        GradeComparisonTool gradeComparisonTool = new GradeComparisonTool();
        Assertions.assertEquals('B', GradeComparisonTool.findMinGrade('B','A','A','A','A'));
        Assertions.assertEquals('B', GradeComparisonTool.findMinGrade('A','B','A','A','A'));
        Assertions.assertEquals('B', GradeComparisonTool.findMinGrade('A','A','B','A','A'));
        Assertions.assertEquals('B', GradeComparisonTool.findMinGrade('A','A','A','B','A'));
        Assertions.assertEquals('B', GradeComparisonTool.findMinGrade('A','A','A','A','B'));
    }
    @Test
    public void testForC(){
        GradeComparisonTool gradeComparisonTool = new GradeComparisonTool();
        Assertions.assertEquals('C', GradeComparisonTool.findMinGrade('C','A','A','A','A'));
        Assertions.assertEquals('C', GradeComparisonTool.findMinGrade('A','C','A','A','A'));
        Assertions.assertEquals('C', GradeComparisonTool.findMinGrade('A','A','C','A','A'));
        Assertions.assertEquals('C', GradeComparisonTool.findMinGrade('A','A','A','C','A'));
        Assertions.assertEquals('C', GradeComparisonTool.findMinGrade('A','A','A','A','C'));
    }
    @Test
    public void testForD(){
        GradeComparisonTool gradeComparisonTool = new GradeComparisonTool();
        Assertions.assertEquals('D', GradeComparisonTool.findMinGrade('D','A','A','A','A'));
        Assertions.assertEquals('D', GradeComparisonTool.findMinGrade('A','D','A','A','A'));
        Assertions.assertEquals('D', GradeComparisonTool.findMinGrade('A','A','D','A','A'));
        Assertions.assertEquals('D', GradeComparisonTool.findMinGrade('A','A','A','D','A'));
        Assertions.assertEquals('D', GradeComparisonTool.findMinGrade('A','A','A','A','D'));
    }
    @Test
    public void testForF() {
        GradeComparisonTool gradeComparisonTool = new GradeComparisonTool();
        Assertions.assertEquals('F', GradeComparisonTool.findMinGrade('F', 'A', 'A', 'A', 'A'));
        Assertions.assertEquals('F', GradeComparisonTool.findMinGrade('A', 'F', 'A', 'A', 'A'));
        Assertions.assertEquals('F', GradeComparisonTool.findMinGrade('A', 'A', 'F', 'A', 'A'));
        Assertions.assertEquals('F', GradeComparisonTool.findMinGrade('A', 'A', 'A', 'F', 'A'));
        Assertions.assertEquals('F', GradeComparisonTool.findMinGrade('A', 'A', 'A', 'A', 'F'));
    }
}

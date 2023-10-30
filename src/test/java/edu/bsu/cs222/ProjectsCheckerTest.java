package edu.bsu.cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectsCheckerTest {
    @Test
    public void testForA() {
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertEquals('A', ProjectsChecker.finalProjectGrader('A','A'));
        Assertions.assertEquals('A', ProjectsChecker.finalProjectGrader('A','B'));
        Assertions.assertEquals('A', ProjectsChecker.finalProjectGrader('A','C'));
        Assertions.assertEquals('A', ProjectsChecker.finalProjectGrader('A','D'));
    }
    @Test
    public void testForB(){
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertEquals('B', ProjectsChecker.finalProjectGrader('B', 'A'));
    }
    @Test
    public void testForC(){
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertEquals('C', ProjectsChecker.finalProjectGrader('C', 'A'));
    }
    @Test
    public void testForD(){
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertEquals('D', ProjectsChecker.finalProjectGrader('D', 'A'));
    }
    @Test
    public void testForF(){
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertEquals('F', ProjectsChecker.finalProjectGrader('F', 'A'));
    }
    @Test
    public void testOtherGrades(){
        ProjectsChecker projectsChecker = new ProjectsChecker();
        Assertions.assertTrue(ProjectsChecker.remainingProjectsGrader('A'));
        Assertions.assertTrue(ProjectsChecker.remainingProjectsGrader('B'));
        Assertions.assertTrue(ProjectsChecker.remainingProjectsGrader('C'));
        Assertions.assertTrue(ProjectsChecker.remainingProjectsGrader('D'));
        Assertions.assertFalse(ProjectsChecker.remainingProjectsGrader('F'));
    }
}

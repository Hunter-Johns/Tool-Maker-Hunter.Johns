package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AchievementsCheckerTest {

    @Test
    public void testForA(){
        AchievementsChecker achievementsChecker = new AchievementsChecker();
        Assertions.assertEquals('A', AchievementsChecker.achievementGrader(6));
    }
    @Test
    public void testForB(){
        AchievementsChecker achievementsChecker = new AchievementsChecker();
        Assertions.assertEquals('B', AchievementsChecker.achievementGrader(4));
    }
    @Test
    public void testForC(){
        AchievementsChecker achievementsChecker = new AchievementsChecker();
        Assertions.assertEquals('C', AchievementsChecker.achievementGrader(2));
    }
    @Test
    public void testForD(){
        AchievementsChecker achievementsChecker = new AchievementsChecker();
        Assertions.assertEquals('D', AchievementsChecker.achievementGrader(0));
    }
    @Test
    public void testForF(){
        AchievementsChecker achievementsChecker = new AchievementsChecker();
        Assertions.assertNotEquals('F', AchievementsChecker.achievementGrader(0));
    }
}

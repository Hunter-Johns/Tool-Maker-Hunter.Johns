package edu.bsu.cs222;

public class AchievementsChecker {

    public static char achievementGrader(int numAchievementsComplete){
        if (numAchievementsComplete > 5){
            return 'A';
        }
        else if (numAchievementsComplete > 3){
            return 'B';
        }
        else if (numAchievementsComplete > 1){
            return 'C';
        }
        else{
            return 'D';
        }
    }
}

public class ChallengeOne {
    public static void main(String[] args){
        int displayScore = calculateHighScorePosition(1200);
        displayHighScorePosition("Tim", displayScore);
        displayScore = calculateHighScorePosition(520);
        displayHighScorePosition("Tim", displayScore);
        displayScore = calculateHighScorePosition(110);
        displayHighScorePosition("Tim", displayScore);
        displayScore = calculateHighScorePosition(20);
        displayHighScorePosition("Tim", displayScore);
    }

    public static int  calculateHighScorePosition(int score){
        if(score >= 1000){
            score = 1;
        } else if(score >= 500){
            score = 2;
        } else if(score >= 100){
            score = 3;
        } else {
            score = 4;
        }
        return score;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get " + position + " in a high score list");
    }
}

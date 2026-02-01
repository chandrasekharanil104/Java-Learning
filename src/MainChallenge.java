public class MainChallenge {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The final score is : " + highScore);
        System.out.println("The final Score is: " + calculateScore(true, 200, 5, 10));
    }

    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}

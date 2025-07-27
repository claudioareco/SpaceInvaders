package singleton;

public class ScoreManager {
    private static ScoreManager instance;
    private int score;

    private ScoreManager() {
        this.score = 0;
    }

    public static ScoreManager getInstance() {
        if (instance == null) {
            instance = new ScoreManager();
        }
        return instance;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

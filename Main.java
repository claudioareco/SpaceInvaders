import strategy.SimpleShot;
import strategy.ShootingStrategy;
import singleton.ScoreManager;
import factory.EnemyFactory;
import factory.AlienEnemy;
import factory.RobotEnemy;
import factory.Enemy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Space Invaders inicializado...");

        // Inicializar jugador
        Player player = new Player();
        player.setShootingStrategy(new SimpleShot());

        // Disparar
        player.shoot(5, 10);

        // Crear enemigos con Factory
        Enemy alien = EnemyFactory.createEnemy("alien");
        alien.draw();

        Enemy robot = EnemyFactory.createEnemy("robot");
        robot.draw();

        // Puntaje con Singleton
        ScoreManager score = ScoreManager.getInstance();
        score.addScore(100);
        System.out.println("Puntaje actual: " + score.getScore());
    }
}

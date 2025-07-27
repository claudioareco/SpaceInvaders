public class EnemyFactory {
    public static Enemy createEnemy(String type) {
        switch (type.toLowerCase()) {
            case "alien": return new AlienEnemy();
            case "robot": return new RobotEnemy();
            default: throw new IllegalArgumentException("Tipo de enemigo desconocido: " + type);
        }
    }
}
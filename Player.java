import strategy.ShootingStrategy;

public class Player {
    private ShootingStrategy shootingStrategy;

    public void setShootingStrategy(ShootingStrategy strategy) {
        this.shootingStrategy = strategy;
    }

    public void shoot(int x, int y) {
        if (shootingStrategy != null) {
            shootingStrategy.shoot(x, y);
        }
    }
}

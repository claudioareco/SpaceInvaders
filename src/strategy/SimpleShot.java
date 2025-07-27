package strategy;

public class SimpleShot implements ShootingStrategy {
    public void shoot(int x, int y) {
        System.out.println("Disparo simple desde posición (" + x + ", " + y + ")");
    }
}

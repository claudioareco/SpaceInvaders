package strategy;

public class DoubleShot implements ShootingStrategy {
    public void shoot(int x, int y) {
        System.out.println("Disparo doble desde posición (" + x + ", " + y + ")");
    }
}

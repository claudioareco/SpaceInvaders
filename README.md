# Space Invaders (Java)

Este proyecto es una implementación simplificada del clásico videojuego **Space Invaders**, desarrollado en Java como ejercicio práctico de los patrones de diseño:

- 🧠 **Strategy**
- 🏭 **Factory**
- 🧍‍♂️ **Singleton**

## 🧱 Estructura del Proyecto
SpaceInvaders/
└── src/
├── Main.java
├── Player.java
├── Enemy.java
├── factory/
│ ├── EnemyFactory.java
│ ├── AlienEnemy.java
│ └── RobotEnemy.java
├── strategy/
│ ├── ShootingStrategy.java
│ ├── SimpleShot.java
│ └── DoubleShot.java
└── singleton/
└── ScoreManager.java

markdown
Copiar
Editar

## 🧠 Patrones Aplicados

- **Strategy:** permite que el jugador dispare de diferentes maneras (ej. disparo simple o doble).
- **Factory:** genera enemigos (`AlienEnemy`, `RobotEnemy`) a través de una única clase de creación.
- **Singleton:** gestiona el puntaje global del juego con una única instancia compartida.

## ▶️ Cómo ejecutar el juego

### 1. Compilar (desde el directorio raíz del proyecto):

```bash
javac src/*.java src/factory/*.java src/strategy/*.java src/singleton/*.java
2. Ejecutar:
bash
Copiar
Editar
java -cp src Main
👨‍💻 Requisitos
Java 11 o superior

Terminal (CMD, PowerShell, Bash)

Git (para clonar o subir cambios)

📚 Créditos
Desarrollado por Claudio Areco como trabajo práctico para la facultad.

¡Gracias por visitar este repositorio!
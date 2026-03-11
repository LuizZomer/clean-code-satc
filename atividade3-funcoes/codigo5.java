class Character {

    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void receiveDamage(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println(name + " perdeu!");
        } else {
            System.out.println("Vida de " + name + ": " + health);
        }
    }

    public int getHealth() {
        return health;
    }
}

public class Game {

    private Character player;
    private Character enemy;

    public Game(int playerHealth, int enemyHealth) {
        this.player = new Character("Jogador", playerHealth);
        this.enemy = new Character("Inimigo", enemyHealth);
    }

    public void attackPlayer(int damage) {
        player.receiveDamage(damage);
    }

    public void attackEnemy(int damage) {
        enemy.receiveDamage(damage);
    }

    public int getPlayerHealth() {
        return player.getHealth();
    }

    public int getEnemyHealth() {
        return enemy.getHealth();
    }
}
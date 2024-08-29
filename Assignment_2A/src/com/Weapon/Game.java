package com.Weapon;

public class Game {
    private GameState gameState;
    private EnemyFactory enemyFactory;
    private GameItemFactory itemFactory;

    public Game() {
        this.gameState = GameState.getInstance();
        setupFactories();
    }

    private void setupFactories() {
        if (gameState.getDifficulty() == 1) {
            // Easy difficulty
            enemyFactory = new EasyEnemyFactory();
            itemFactory = new EasyGameItemFactory();
        } else {
            // Hard difficulty
            enemyFactory = new HardEnemyFactory();
            itemFactory = new HardGameItemFactory();
        }
    }

    public void spawnEnemy() {
        Enemy enemy = enemyFactory.createEnemy();
        System.out.println("Spawned: " + enemy.getType());
        enemy.attack();
    }

    public void useWeapon() {
        Weapon weapon = itemFactory.createWeapon();
        weapon.use();
    }

    public void activatePowerUp() {
        PowerUp powerUp = itemFactory.createPowerUp();
        powerUp.activate();
    }

    public static void main(String[] args) {
        // Example usage
        GameState gameState = GameState.getInstance();
        gameState.setDifficulty(1); // Set difficulty to Easy
        Game game = new Game();

        game.spawnEnemy();
        game.useWeapon();
        game.activatePowerUp();

        // Change difficulty
        gameState.setDifficulty(2); // Set difficulty to Hard
        game = new Game(); // Reinitialize to apply new difficulty

        game.spawnEnemy();
        game.useWeapon();
        game.activatePowerUp();
    }
}


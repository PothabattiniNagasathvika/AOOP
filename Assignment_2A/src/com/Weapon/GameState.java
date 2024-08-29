package com.Weapon;

public class GameState {
    private static GameState instance;
    private String currentLevel;
    private int difficulty;

    // Private constructor
    private GameState() {
        this.currentLevel = "Level 1";
        this.difficulty = 1; // Default difficulty
    }

    // Public method to get the instance
    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Getter and setter methods
    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}


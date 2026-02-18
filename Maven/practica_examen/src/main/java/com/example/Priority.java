package com.example;

public enum Priority {

    HIGH(1) , MEDIUM(2) , LOW(3);

    private final int levelPriority;

    private Priority(int levelPriority) {
        this.levelPriority = levelPriority;
    }

    public int getLevelPriority(){
        return levelPriority;
    }
}

package ru.otus.java.basic.homeworks;

import java.util.Random;

public class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(final int food) {
        this.maxFood = food;
        this.currentFood = maxFood;
    }

    public void addFood(final int amount) {
        this.currentFood = Math.min(this.currentFood + amount, this.maxFood);
    }

    public boolean decreaseFood(final int amount) {
        if (this.currentFood >= amount) {
            this.currentFood -= amount;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("В тарелке: " + this.currentFood + " из " + this.maxFood);
    }
}

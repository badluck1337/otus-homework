package ru.otus.java.basic.homeworks;

public class Horse extends Animal implements ISwimmable {
    public Horse(String name, float speed, int endurance, boolean tired) {
        super(name, speed, endurance, tired);
    }
    @Override
    public float swim(int distance) {
        return distance > endurance/4 ? fatigue() : distance / waterSpeed;
    }
}

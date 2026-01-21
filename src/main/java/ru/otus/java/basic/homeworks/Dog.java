package ru.otus.java.basic.homeworks;

public class Dog extends Animal implements ISwimmable{

    public Dog(String name, float speed, int endurance, boolean tired) {
        super(name, speed, endurance, tired);
    }

    @Override
    public float swim(int distance) {
        return distance > endurance/2 ? fatigue() : distance / waterSpeed;
    }
}

package ru.otus.java.basic.homeworks;

public abstract class Animal {
    protected String name;
    protected float speed, waterSpeed;
    protected int endurance;
    protected boolean tired;

    public Animal(String name, float speed, int endurance, boolean tired) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
        this.tired = tired;
    }

    public float run(int distance) {
        return distance > endurance ? fatigue() : distance / speed;
    }

    protected float fatigue() {
        System.out.println("ЖИВОТНОЕ УСТАЛО " + name);
        tired = true;
        return -1;
    }

    public void info(){
        System.out.println(tired ? "УСТАЛО" : "НЕ УСТАЛО");
    }

}

package ru.otus.java.basic.homeworks;


public class Cat {
    private final String name;
    private final int appetite;
    private boolean isFed;

    public Cat(final String name, final int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(final Plate plate) {
        if (plate.decreaseFood(this.appetite)) {
            this.isFed = true;
        }
    }

    public void info() {
        System.out.println(this.name + ": " + (this.isFed ? "сыт" : "голоден"));
    }
}

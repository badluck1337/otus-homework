package ru.otus.java.basic.homeworks;

public abstract class Vehicle {
    public abstract boolean move(Landscape landscape);

    public abstract boolean cantGo(Landscape landscape);

    protected void success() {
        System.out.println("Успешно поехал");
    }

    protected void error() {
        System.out.println("Данный вид транспорта не может проехать в данной местности");
    }
}

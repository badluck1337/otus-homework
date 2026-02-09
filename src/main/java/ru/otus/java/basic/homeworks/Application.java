package ru.otus.java.basic.homeworks;


import module java.base;

public class Application {
    public static void main(final String[] args) {
        Human human = new Human("Alex");
        human.move(Landscape.SWAMP);

        human.sitDown(new AllTerrainVehicle());
        human.move(Landscape.SWAMP);

        human.sitDown(new Bike());

        human.standUp();


        human.sitDown(new Bike());
        human.move(Landscape.SWAMP);


    }
}

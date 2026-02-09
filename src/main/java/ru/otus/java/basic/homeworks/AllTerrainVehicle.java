package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class AllTerrainVehicle extends FuelVehicle {
    @Override
    public boolean move(Landscape landscape) {
        if (petrol > 0.5) {
            petrol -= 0.5;
            System.out.println("Едем на вездеходе");
        } else {
            petrolError();
            return false;
        }
        success();
        return true;
    }

    @Override
    public boolean cantGo(Landscape landscape) {
        return false;
    }
}

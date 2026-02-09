package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class Car extends FuelVehicle {

    @Override
    public boolean move(Landscape landscape) {
        if (!cantGo(landscape)) {
            if (petrol > 0.5) {
                petrol -= 0.5;
                success();
                return true;
            } else {
                petrolError();
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean cantGo(Landscape landscape) {
        return Arrays.asList(Landscape.DENSE_FOREST, Landscape.SWAMP).contains(landscape);
    }
}

package ru.otus.java.basic.homeworks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bike extends Vehicle {
    @Override
    public boolean move(Landscape landscape) {
        if (!cantGo(landscape)) {
            success();
            return true;
        }
        error();
        return false;
    }

    @Override
    public boolean cantGo(Landscape landscape) {
        return Objects.equals(Landscape.SWAMP, landscape);
    }
}

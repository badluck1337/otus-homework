package ru.otus.java.basic.homeworks;

import java.util.Objects;

public class Horse extends Vehicle {
    private int strength;

    @Override
    public boolean move(Landscape landscape) {
        if (!cantGo(landscape)) {
            if (strength > 1) {
                strength -= 1;
                success();
                return true;
            } else {
                System.out.println("Недостаточно сил у лошади");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean cantGo(Landscape landscape) {
        return Objects.equals(Landscape.SWAMP, landscape);
    }
}

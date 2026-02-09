package ru.otus.java.basic.homeworks;

public class Human {
    private final String name;
    private Vehicle currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public boolean move(Landscape landscape) {
        if (currentTransport != null) {
            return currentTransport.move(landscape);
        }
        System.out.println("Человек пошел пешком");
        return true;
    }

    public void sitDown(Vehicle vehicle) {
        if (this.currentTransport == null) {
            System.out.println("Человек с именем " + name + " сел в " + vehicle.getClass().getName()
                    .replace("ru.otus.java.basic.homeworks.", ""));
            this.currentTransport = vehicle;
        } else {
            System.out.println("Человек с именем " + name + " уже сидит в " + currentTransport.getClass().getName()
                    .replace("ru.otus.java.basic.homeworks.", ""));
        }
    }

    public void standUp() {
        if (this.currentTransport != null) {
            System.out.println("Человек с именем " + name + " встал с " + currentTransport.getClass().getName().replace("ru.otus.java.basic.homeworks.", ""));
            currentTransport = null;
        } else {
            System.out.println("Человек с именем " + name + " не сидит в каком либо транспорте");
        }
    }
}

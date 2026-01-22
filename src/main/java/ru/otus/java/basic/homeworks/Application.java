package ru.otus.java.basic.homeworks;


import module java.base;

public class Application {


    public static void main(final String[] args) {
        final var cats = Arrays.asList(
                new Cat("Вася", 10),
                new Cat("Цезарь", 15),
                new Cat("Стич", 20),
                new Cat("Гарфилд", 25)
        );


        final var plate = new Plate(50);

        System.out.println("Кормление котов:");
        plate.info();
        System.out.println();

        cats.forEach(cat -> cat.eat(plate));

        System.out.println("\nРезультат:");
        cats.forEach(Cat::info);
        plate.info();
    }


}

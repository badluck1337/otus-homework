package ru.otus.java.basic.homeworks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Application {
    private Random random;
    private ArrayList<Function> functions;

    interface Function {
        void call();
    }

    public Application() {
        random = new Random();
        functions = new ArrayList<>();

        functions.add(this :: greetings);
        functions.add(() -> this.checkSign(random.nextInt(),random.nextInt(),random.nextInt()));
        functions.add(this :: selectColor);
        functions.add(this :: compareNumbers);
        functions.add(() -> this.addOrSubtractAndPrint(random.nextInt(),random.nextInt(),random.nextBoolean()));


    }

    public static void main(String[] args) {
        Application application = new Application();
        application.greetings();
        application.checkSign(1, 1, 1);
        application.selectColor();
        application.compareNumbers();
        application.addOrSubtractAndPrint(1,3,true);

        String s = JOptionPane.showInputDialog("Введите число от 1 до 5");
        try{
            int value = Integer.parseInt(s) - 1;
            application.functions.get(value).call();

        }catch (Exception e){
            System.out.println("Вы ввели что-то не так | " + e);
        }

    }

    public void greetings() {
        String msg = "Hello World from Java";
        String[] array = msg.split(" ");
        Arrays.stream(array).toList().forEach(System.out::println);
    }

    public void checkSign(int a, int b, int c) {
        System.out.println(a + b + c >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public void selectColor() {
        int data = random.nextInt();
        String msg = "s";
        if (data <= 10) {
            msg = "Красный";
        } else if (data <= 20) {
            msg = "Желтый";
        } else {
            msg = "Зеленый";
        }
        System.out.println(msg + " | " + data);
    }

    public void compareNumbers() {
        int a = random.nextInt();
        int b = random.nextInt();
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        initValue = increment ? initValue + delta : initValue - delta;
        System.out.println(initValue);
    }
}

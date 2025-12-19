package ru.otus.java.basic.homeworks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.print("s", 2);
        application.arrayPrint(new int[]{1, 2, 6});
        application.arrayFill(2, new int[]{1, 2, 3});
        application.arrayAdd(2, new int[]{1, 2, 3});
        application.arrayCheck(new int[]{1, 2, 3,-1 , 100});
    }

    public void print(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    public void arrayPrint(int[] array) {
        AtomicInteger num = new AtomicInteger();
        Arrays.stream(array).filter(x -> x > 5).forEach(x ->
                num.set(num.get() + x)
        );
        System.out.println(num);
    }

    public void arrayFill(int num, int[] array) {
        Arrays.fill(array, num);
    }

    public void arrayAdd(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + num;
        }
    }

    public void arrayCheck(int[] array) {
        int middle = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                leftSum += array[i];
            } else if (array.length % 2 == 0 || i > middle) {
                rightSum += array[i];
            }
        }

        System.out.println(leftSum > rightSum ? "Левый больше " + leftSum : "Правый больше " + rightSum );
    }


}

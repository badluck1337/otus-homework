package ru.otus.java.basic.homeworks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;


public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        System.out.println( application.sumOfPositiveElements(new int[][]{
                {1, 2, 4},
                {1, 2, 5},
                {1, -100, 5},
        }));
        application.drawQuad(5);
        application.diagonullException(new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        });
        System.out.println(application.getMax(new int[][]{
                {1, 1, 1, 1},
                {1, 400, 1, 1},
                {1, 100, 1, 1},
                {1, 1, 1000, 1}
        }));

        System.out.println(application.getTwo(new int[][]{
                {1, 1, 1, 1},
                {1, 400, 1, 1}
        }));
    }

    public int sumOfPositiveElements(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).filter(x -> x > 0).sum();
    }

    public void drawQuad(int size) {
        String line = "*".repeat(size);
        String text = String.join("\n", Collections.nCopies(size, line));
        System.out.println(text);
    }

    public void diagonullException(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array[i].length) {
                array[i][i] = 0;
            }
        }
    }

    public int getMax(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).max().orElse(Integer.MIN_VALUE);
    }

    public int getTwo(int[][] array) {
        if (array.length > 1) {
            return Arrays.stream(array[1]).max().orElse(-1);
        } else {
            return -1;
        }
    }


}

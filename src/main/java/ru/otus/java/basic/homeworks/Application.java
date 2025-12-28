package ru.otus.java.basic.homeworks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


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
        int sum = 0;
        for (int[] a : array) {
            for (int b : a) {
                if (b > 0)
                    sum += b;
            }
        }
        return sum;
    }

    public void drawQuad(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 0; a < size; a++) {
            if (a > 0)
                stringBuilder.append("\n");

            stringBuilder.append("*".repeat(size));
        }
        System.out.println(stringBuilder);
    }

    public void diagonullException(int[][] array) {
        List<int[]> list = Arrays.stream(array).toList();
        for (int i = 0; i < list.size(); i++) {
            list.get(i)[i] = 0;
        }

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < list.size(); i++) {
            for (int z = 0; z < list.get(i).length; z++) {
                stringBuilder.append(list.get(i)[z]);
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    public int getMax(int[][] array) {
        int max = 0;
        List<int[]> list = Arrays.stream(array).toList();
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(Arrays.stream(list.get(i)).max().getAsInt(), max);
        }
        return max;

    }
    public int getTwo(int[][] array) {

        List<int[]> list = Arrays.stream(array).toList();
        if (list.size() > 1){
            return Arrays.stream(list.get(1)).max().getAsInt();
        }else{
            return -1;
        }
    }


}

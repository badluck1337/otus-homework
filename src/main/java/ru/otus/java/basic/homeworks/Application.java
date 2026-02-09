package ru.otus.java.basic.homeworks;


import module java.base;

public class Application {


        static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {

            if (array.length != 4) {
                throw new AppArraySizeException("Массив должен содержать 4x4 элементов");
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new AppArraySizeException("Массив должен содержать 4x4 элементов");
                }
            }

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {

                        sum = Math.addExact(sum,Integer.parseInt(array[i][j]));
                    } catch (NumberFormatException ex) {
                        throw new AppArrayDataException(
                                "Не удалось преобразовать строку в число в ячейке: " + String.format("%d %d", i, j));
                    }

                }
            }

            return sum;
        }

        public static void main(String[] args) {
            String[][] array = {{"0", "1", "2", "6"}, {"5", "4", "7", "8s"}, {"0", "1", "2", "6"},
                    {"5", "6", "7", "8"}};

            try {
                System.out.println("Сумма элементов массива равна: " + sumArray(array));
            } catch (AppArraySizeException e) {
                e.printStackTrace();
            } catch (AppArrayDataException e) {
                e.printStackTrace();
            }

        }

}

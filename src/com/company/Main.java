package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double[] arr = {-1.2, 5.2, 5.6, 6.2, 7.56, 9.2, -6.66, -4.72, -8.2, -2.64, -4.6, -7.42, -3.16, 5.24, 4.88};
        System.out.println("Массив до преобразований:\n" + Arrays.toString(arr));

        ArrayList<Integer> destination = new ArrayList<>();
        int positive_count = 0;
        int negative_count = 0;
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0) && (arr[i] < 0)) {
                result += arr[i];
                negative_count++;
                System.out.print(arr[i] + " ");
            }

            if (arr[i] >= 0) positive_count++;
            if (positive_count == 2) arr[i] = 0;
            if (arr[i] % 1 == 0) destination.add((int) arr[i]);
        }

        if (negative_count == 0) System.out.println("Нет отрицательных чисел!");
        else System.out.println("Среднее арифметическое нечетных отрицательных чисел: " + (result / negative_count));
        System.out.println("Массив после преобразований:\n" + destination.toString());
        System.out.println("------------------");
        }
    }
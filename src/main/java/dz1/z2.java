package dz1;

import java.util.Arrays;

public class z2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        System.out.println(Arrays.toString(arr));
        int summ = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i+1] < 0) {
                summ = summ + arr[i];
            }
        }
        System.out.printf("Cуммa положительных чисел, после которых следует отрицательное число: %d ", summ);
    }
}

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
 * после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */
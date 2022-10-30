package lab0;

import java.util.Arrays;
import java.util.Comparator;

public class Variant1 {


    /**
     Дано трехзначное число. Используя одну операцию деления нацело, вывести первую цифру данного числа (сотни).
     */
    public int integerNumbersTask(int k) {
        return k / 100;
    }

    /**
     Даны два целых числа: A, B. Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».
     */
    public boolean booleanTask(int a, int b) {
        return ((a % 2 != 0) || (b % 2 != 0));
    }


    /**
     Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений, а в B — большее. Вывести новые значения переменных A и B.
     */
    public int[] ifTask(int a, int b) {

        if (a > b) {
            int t = a;
            a = b;
            b = t;
            return new int[]{a, b};
        }
        return new int[]{a, b};
    }


    /**
     Даны два целых числа: D (день) и M (месяц), определяющие правильную дату невисокосного года. Вывести значения D и M для даты, следующей за указанной.
     */
    public int[] switchTask(int d, int m) {
        if (d < 1 || d > 31 || m < 1 || m > 12) {
            return new int[]{d, m};
        }
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d == 31) d = 0;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d == 30) d = 0;
                break;
            case 2:
                if (d == 28) d = 0;
                break;
        }
        if (d == 0)
            if (m == 12) m = 1;
            else m++;

        d++;
        return new int[]{d, m};

    }

    /**
     Дано целое число N и набор из N целых чисел. Найти максимальное и минимальное элемента из данного набора и вывести их в указанном порядке.
     */
    public static int[] numbers(int[] array) {
        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }


    /**
     Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
     */
    public int forTask(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }

    /**
     Дано целое число N (> 1). Найти наименьшее целое число K, при котором выполняется неравенство 3K > N.
     */
    public int whileTask(int n) {
        int k = 1, temp = 3;
        while (temp <= n) {
            temp *= 3;
            ++k;
        }
        return k;
    }

    /**
     * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа в порядке убывания их индексов, а также их количество K.
     */
    public static Integer[] arrayTask(Integer[] array) {
        int k = 0;
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }

        Integer[] a = new Integer[k];
        for (int i = 0; i < k; i++) {
            if (array[i] % 2 == 0) {
                a[i] = array[i];
            }
        }
        Arrays.sort(a, (o1, o2) -> o2.compareTo(o1));
        return a;
    }

    /**
     Дана матрица размера M ґ N. Вывести ее элементы, расположенные в строках с четными номерами (2, 4, …). Вывод элементов производить по строкам, условный оператор не использовать.
     */
    public static int[][] matrixTask(int[][] input) {
        int n=input.length;

        int resLength = n / 2;
        if (n % 2 == 0) {
            resLength += 1;
        }
        int m = input[0].length;
        int[][] b = new int[resLength][m];
        for (int j = 1; j < n; j += 2) {
            for (int i = 0; i < m; i++) {
                b[j][i] = input[j][i];
            }
        }
        return b;
    }

}
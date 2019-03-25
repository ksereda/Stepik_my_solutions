package module_4.task_2;

/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины,
в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный
результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить,
так что это остается на вашей совести :)
*/

import java.util.Arrays;

public class Main {

    // Without Arrays.sort
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0;

        for (int k = 0; k < a3.length; k++){

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }

        return a3;

    }

    // With Arrays.sort
    public static int[] mergeArrays2(int[] a1, int[] a2) {

        int[] resultArray = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, resultArray, 0, a1.length);
        System.arraycopy(a2, 0, resultArray, a1.length, a2.length);
        Arrays.sort(resultArray);

        return resultArray;
    }

}

package module_2_2.task_2;

/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:
    - воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
    - применив пару трюков из двоичной арифметики;
    - написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
*/

public class Main {

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

}

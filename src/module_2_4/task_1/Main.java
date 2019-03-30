package module_2_4.task_1;

/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал 𝑁 вычисляется как 1⋅2⋅...⋅𝑁.

Поскольку это очень быстро растущая функция, то даже для небольших 𝑁 вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
*/

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {

    // Solution 1
    public static BigInteger factorial(int value) {

        BigInteger resultNumber = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            resultNumber = resultNumber.multiply(BigInteger.valueOf(i));
        }
        return resultNumber;

    }

    // Solution 2
    public static BigInteger factorial2(int n) {

       return IntStream.rangeClosed(1, n).mapToObj(i -> BigInteger.valueOf(i)).reduce(BigInteger.ONE, BigInteger::multiply);

    }

}

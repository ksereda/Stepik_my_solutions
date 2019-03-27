package module_2_4.task_1;

/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал 𝑁 вычисляется как 1⋅2⋅...⋅𝑁.

Поскольку это очень быстро растущая функция, то даже для небольших 𝑁 вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
*/

import java.math.BigInteger;

public class Main {

    public static BigInteger factorial(int value) {

        BigInteger resultNumber = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            resultNumber = resultNumber.multiply(BigInteger.valueOf(i));
        }
        return resultNumber;

    }

}

package module_5_3.task_2;

/*
Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.

На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод main, прописать все import'ы.

Sample Input 1:

1 2 3
Sample Output 1:

6.000000
Sample Input 2:

a1 b2 c3
Sample Output 2:

0.000000
Sample Input 3:

-1e3
18 .111 11bbb
Sample Output 3:

-981.889000
*/

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        double symbol;
        double result = 0.0;

        while (scanner.hasNext()) {

            if (scanner.hasNextDouble()) {
                symbol = scanner.nextDouble();
                result += symbol;
            } else {
                scanner.next();
            }

        }

        System.out.printf(Locale.ENGLISH, "%.6f", result);

    }

}


package module_6_2.task_2;

import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

/*
Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

В этом задании надо написать программу целиком, включая import'ы, декларацию класса ComplexNumber и метода main.

Sample Input:
1 2 3 4 5 6 7

Sample Output:
6 4 2
*/

public class Main {

    public static void main(String[] args) {
        test();
        test2();
    }

    // Solution 1
    public static void test() {

        Deque<Integer> q = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; scanner.hasNextInt(); i++) {
            if (i % 2 != 0) {
                q.addFirst(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
        }

        q.forEach((b)-> System.out.print(b + " "));

    }

    // Solution 2
    public static void test2() {

        ArrayDeque<Integer> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            scanner.nextInt();

            if (scanner.hasNext()) {
                q.addFirst(scanner.nextInt());
            }

        }

        q.forEach(x-> System.out.print(x + " "));
    }

}



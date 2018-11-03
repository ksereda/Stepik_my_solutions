package collections_6_2;

import java.util.*;

/* Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример:
Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> setResult = new HashSet<>(set1);
        setResult.removeAll(set2);
        Set<T> tempSet = new HashSet<>(set2);
        tempSet.removeAll(set1);
        setResult.addAll(tempSet);

        return setResult;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        System.out.println("Первое множество: " + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");
        System.out.println("Второе множество: " + set2);

        System.out.println("Разность множеств: " + symmetricDifference(set1, set2));
    }
}




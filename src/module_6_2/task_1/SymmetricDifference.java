package module_6_2.task_1;

import java.util.*;

/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример:
Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
*/

public class SymmetricDifference {

    // Solution 1
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> set1Result = new HashSet<>(set1);
        set1Result.removeAll(set2);
        Set<T> set2Result = new HashSet<>(set2);
        set2Result.removeAll(set1);
        set1Result.addAll(set2Result);

        return set1Result;
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

    // Solution 2
//    public static <T> Set<T> symmetricDifference2(Set<? extends T> set1, Set<? extends T> set2) {
//        Set<T> set = new HashSet<>();
//        set.addAll(set1);
//        set.addAll(set2);
//        System.out.println("Сумма множеств: " + set);
//
//        Iterator<T> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            T sameValues = iterator.next();
//            if (set1.contains(sameValues) && set2.contains(sameValues)) {
//                iterator.remove();
//            }
//        }
//        return set;
//    }
//
//    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        set1.add("1");
//        set1.add("2");
//        set1.add("3");
//        System.out.println("Первое множество: " + set1);
//
//        Set<String> set2 = new HashSet<>();
//        set2.add("0");
//        set2.add("1");
//        set2.add("2");
//        System.out.println("Второе множество: " + set2);
//
//        System.out.println("Разность множеств: " + symmetricDifference2(set1, set2));
//    }

}




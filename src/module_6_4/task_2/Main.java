package module_6_4.task_2;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);
*/

public class Main {

    // Solution 1
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T min = null;
        T max = null;
        T[] streamArray;

        streamArray = (T[]) stream.sorted(order).toArray();

        if (streamArray.length == 1) {
            min = streamArray[0];
            max = streamArray[0];
            minMaxConsumer.accept(min, max);
        } else if (streamArray.length > 1){
            min = streamArray[0];
            max = streamArray[streamArray.length - 1];
            minMaxConsumer.accept(min, max);
        } else
            minMaxConsumer.accept(min, max);

    }

    // Solution 2
    public static <T> void findMinMax2(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> listStream = stream.collect(Collectors.toList());
        T min = listStream.stream().min(order).orElse(null);
        T max = listStream.stream().max(order).orElse(null);

        minMaxConsumer.accept(min, max);
    }

}

package module_6_3;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainTest {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        // Solution 1
        // return a -> condition.test(a) ? ifTrue.apply(a) : ifFalse.apply(a);


        // Solution 2
        Function<T, U> result = x -> {
            if (condition.test(x)) {
                return ifTrue.apply(x);
            } else {
                return ifFalse.apply(x);
            }
        };

        return result;

    }

}

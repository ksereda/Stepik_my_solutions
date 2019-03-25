package module_2_2.task_1;

/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
*/

public class Main {

    // Solution 1
    public static char charExpression(int a) {
        char y = '\\';
        y += a;
        return y;
    }


    // Solution 2
    public static char charExpression2(int a) {
        int y = '\\';
        return (char) (y + a);
    }

}

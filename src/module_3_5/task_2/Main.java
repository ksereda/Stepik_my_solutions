package module_3_5.task_2;

/*
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок
заниматься не нужно. Тем более мы еще не проходили исключения.

P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254
*/

public class Main {

    public class AsciiCharSequence implements CharSequence {

        private byte[] byteData;

        public AsciiCharSequence(byte[] data) {
            this.byteData = data;
        }

        @Override
        public int length() {
            return byteData.length;
        }

        @Override
        public char charAt(int i) {
            return (char) byteData[i];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte [] result = new byte[end - start];
            System.arraycopy(this.byteData, start, result, 0, end - start);
            return new AsciiCharSequence(result);
        }

        @Override
        public String toString() {
            return new String(byteData);
        }

    }

}

package module_5_3.task_1;

/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример

InputStream последовательно возвращает четыре байта: 48 49 50 51.

Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Main {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        int in;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();

        while ((in = reader.read()) > -1) {
            result.append((char) in);
        }

        return result.toString();

    }


}

package module_5_2.task_2;

/*
По историческим причинам на разных платформах принят разный способ обозначения конца строки в текстовом файле. На Unix-системах конец строки обозначается символом с кодом 10 ('\n'), на Windows — двумя последовательными символами с кодами 13 и 10 ('\r' '\n').

Напишите программу, которая будет преобразовывать переводы строк из формата Windows в формат Unix. Данные в формате Windows подаются программе в System.in, преобразованные данные должны выводиться в System.out. На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод main, прописать все import'ы.

Требуется заменить все вхождения пары символов '\r' и '\n' на один символ '\n'. Если на входе встречается одиночный символ '\r', за которым не следует '\n', то символ '\r' выводится без изменения.

Кодировка входных данных такова, что символ '\n' представляется байтом 10, а символ '\r' — байтом 13. Поэтому программа может осуществлять фильтрацию на уровне двоичных данных, не преобразуя байты в символы.

Из-за буферизации данных в System.out в конце вашей программы надо явно вызвать System.out.flush(). Иначе часть выведенных вами данных не будет видна проверяющей системе.

Пример

Из System.in зачитаны следующие байты: 65 13 10 10 13. Внимание! Это не строка "65 13 10 10 13", а последовательность чисел, возвращаемая методом System.in.read().

В System.out должны быть выведены байты: 65 10 10 13
*/

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Solution 1

        int nextSymbol = 0;
        int currentSymbol = System.in.read();

        while (currentSymbol != -1) {
            nextSymbol = System.in.read();

            if (currentSymbol == 13 & nextSymbol == 10) {
                currentSymbol = nextSymbol;
            } else {
                System.out.write(currentSymbol);
                currentSymbol = nextSymbol;
            }

        }

        System.out.flush();
    }


    // Solution 2

//     int buffer = System.in.read();
//     StringBuilder builder = new StringBuilder();
//
//      while (buffer != -1) {
//        builder.append((char) buffer);
//        buffer = System.in.read();
//     }
//
//     builder = new StringBuilder(builder.toString().replaceAll("\r\n", "\n"));
//
//     System.out.write(builder.toString().getBytes());
//     System.out.flush();


}

